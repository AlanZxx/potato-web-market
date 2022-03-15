package com.potato.marketweb.controller.mall;

import com.potato.marketweb.bean.Goods;
import com.potato.marketweb.bean.MallType;
import com.potato.marketweb.bean.SaleType;
import com.potato.marketweb.commonUtil.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class Mall {
    //数据源
    @Autowired
    DataSource dataSource;
    //用于访问数据库的组件
    @Autowired
    JdbcTemplate jdbcTemplate;

    //    查询所有列表
    @ResponseBody
    @RequestMapping("/getMallTypeList")
    public Result getMallTypeList() {
        System.out.println("@@@@@@@@@@ getMallTypeList");
        //访问数据库user表，查询user表的数据量
        List mallTypes = jdbcTemplate.queryForList("SELECT * from malltype");
        System.out.println(mallTypes.size());
        return Result.ok(mallTypes);
    }

    //    新增种类
    @ResponseBody
    @RequestMapping(value = "/addMallType", method = RequestMethod.POST)
    @Validated
    public Result addMallType(@RequestBody MallType mallType) {
        System.out.println("@@@@@@@@@@ addMallType");
        System.out.println(mallType.toString());
        List mallTypes = jdbcTemplate.queryForList("SELECT * from malltype where typeName = '" + mallType.getTypeName()+"'");
        if (mallTypes.size() != 0) {
            return Result.fail("当前已有种类");
        }
        String dateNowStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTimeInMillis());
        System.out.println(dateNowStr);
        String sql = "insert malltype (typeName,addTime,detail) values('" + mallType.getTypeName() + "','" + dateNowStr + "','" + mallType.getDetail() + "')";
        System.out.println(sql);
        jdbcTemplate.execute(sql);
        return Result.ok("添加成功");
    }

    //    删除种类
    @ResponseBody
    @RequestMapping(value = "/delMallType", method = RequestMethod.POST)
    @Validated
    public Result delMallType(@RequestParam(value = "idList", required = false) String idList) {
        System.out.println("@@@@@@@@@@ delMallType");
        String sql = "delete from malltype where typeId in (" + idList + ")";
        System.out.println(sql);
        jdbcTemplate.execute(sql);
        return Result.ok("删除成功");
    }

    //获取所有种类列表
    @ResponseBody
    @RequestMapping(value = "/getMallTypeIdList", method = RequestMethod.GET)
    @Validated
    public Result getMallTypeIdList() {
        System.out.println("@@@@@@@@@@ getMallTypeIdList");
        Map<String,List> resultMap = new HashMap<>();
        //访问数据库user表，查询user表的数据量
        List mallTypes = jdbcTemplate.queryForList("SELECT typeId as id,typeName as name from malltype");
        List saleTypes = jdbcTemplate.queryForList("SELECT saleTypeId as id,saleTypeName as name from saletype");
        System.out.println(mallTypes.size());
        System.out.println(saleTypes.size());
        resultMap.put("mallTypeList",mallTypes);
        resultMap.put("saleTypeList",saleTypes);
        return Result.ok(resultMap);
    }

    //    修改商品种类
    @ResponseBody
    @RequestMapping(value = "/modMallType", method = RequestMethod.POST)
    @Validated
    public Result modMallType(@RequestBody MallType mallType) {
        System.out.println("@@@@@@@@@@ modMallType");
        System.out.println(mallType);
        String dateNowStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTimeInMillis());
        System.out.println(dateNowStr);
        String sql = "UPDATE `malltype` \n" +
                "SET `typeName` = '"+mallType.getTypeName()+"',\n" +
                "`updateTime` = '"+dateNowStr+"',\n" +
                "`detail` = '"+mallType.getDetail()+"' \n" +
                "WHERE\n" +
                "\t`typeId` = "+mallType.getTypeId();
        System.out.println(sql);
        jdbcTemplate.execute(sql);
        return Result.ok("修改成功");
    }



    //    新增商品
    @ResponseBody
    @RequestMapping(value = "/addGoods", method = RequestMethod.POST)
    @Validated
    public Result addGoods(@RequestBody Goods goods) {
        System.out.println("@@@@@@@@@@ addGoods");
        System.out.println(goods);
        List goodlist = jdbcTemplate.queryForList("SELECT * from goods where goodName = '" + goods.getGoodsName()+"'");
        if (goodlist.size() != 0) {
            return Result.fail("当前商品已存在");
        }
        String dateNowStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTimeInMillis());
        System.out.println(dateNowStr);
        String sql = "INSERT INTO `market`.`goods` (`goodId`, `goodName`, `mallType`, `saleType`, `counts`, `detail`, `price`, `priceDis`, `discount`) VALUES \n" +
                "("+goods.getGoodsId()+", '"+goods.getGoodsName()+"', "+goods.getTypeId()+", "+goods.getSallType()+", "+goods.getCounts()+", '"+goods.getDetail()+"', "+goods.getPrice()+", "+goods.getPriceDis()+", "+goods.getDiscount()+");\n";
        System.out.println(sql);
        jdbcTemplate.execute(sql);
        return Result.ok("添加成功");

    }


    //    查询商品列表
    @ResponseBody
    @RequestMapping("/getGoodList")
    public Result getGoodList() {
        System.out.println("@@@@@@@@@@ getGoodList");
        String sql = "SELECT * from goods g left join saletype s on  g.saletype = s.saleTypeId\n" +
                "left join malltype m on g.mallType = m.typeId";
        System.out.println(sql);
        List mallTypes = jdbcTemplate.queryForList(sql);
        System.out.println(mallTypes.size());
        return Result.ok(mallTypes);
    }

    //    修改商品
    @ResponseBody
    @RequestMapping(value = "/modGoods", method = RequestMethod.POST)
    @Validated
    public Result modGoods(@RequestBody Goods goods) {
        System.out.println("@@@@@@@@@@ modGoods");
        System.out.println(goods);
        String dateNowStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTimeInMillis());
        System.out.println(dateNowStr);
        String sql = "UPDATE `goods` " +
                "SET " +
                "`goodName` = '"+goods.getGoodsName()+"', " +
                "`mallType` = "+goods.getTypeId()+", " +
                "`saleType` = "+goods.getCounts()+", " +
                "`counts` = "+goods.getCounts()+", " +
                "`detail` = '"+goods.getDetail()+"' " +
                "WHERE `goodId` = "+goods.getGoodsId()+";";
        System.out.println(sql);
        jdbcTemplate.execute(sql);
        return Result.ok("添加成功");
    }

    //    删除种类
    @ResponseBody
    @RequestMapping(value = "/delGoods", method = RequestMethod.POST)
    @Validated
    public Result delGoods(@RequestParam(value = "idList", required = false) String idList) {
        System.out.println("@@@@@@@@@@ delMallType");
        String sql = "delete from goods where goodid in (" + idList + ")";
        System.out.println(sql);
        jdbcTemplate.execute(sql);
        return Result.ok("删除成功");
    }



    //    新增销售方式
    @ResponseBody
    @RequestMapping(value = "/addSaleType", method = RequestMethod.POST)
    @Validated
    public Result addSaleType(@RequestBody SaleType saleType) {
        System.out.println("@@@@@@@@@@ saleType");
        System.out.println(saleType);
        List goodlist = jdbcTemplate.queryForList("SELECT * from goods where goodName = '" + saleType.getSaleTypeName()+"'");
        if (goodlist.size() != 0) {
            return Result.fail("当前商品已存在");
        }
        String dateNowStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTimeInMillis());
        System.out.println(dateNowStr);
        String sql = "INSERT INTO `market`.`saletype`( `saleTypeName`, `goodsCount`, `detail`, `addTime`, `updateTime`) VALUES " +
                "('"+saleType.getSaleTypeName()+"', "+saleType.getGoodsCount()+", '"+saleType.getDetail()+"', '"+dateNowStr+"', '"+dateNowStr+"')";
        System.out.println(sql);
        jdbcTemplate.execute(sql);
        return Result.ok("添加成功");
    }


    //    查询售卖方式列表
    @ResponseBody
    @RequestMapping("/getSaleTypeList")
    public Result getSaleTypeList() {
        System.out.println("@@@@@@@@@@ getSaleTypeList");
        String sql = "select * from saleType";
        System.out.println(sql);
        List mallTypes = jdbcTemplate.queryForList(sql);
        System.out.println(mallTypes.size());
        return Result.ok(mallTypes);
    }



    //    删除销售方式
    @ResponseBody
    @RequestMapping(value = "/delSaleType", method = RequestMethod.POST)
    @Validated
    public Result delSaleType(@RequestParam(value = "idList", required = false) String idList) {
        System.out.println("@@@@@@@@@@ delSaleType");
        String sql = "delete from saletype where saleTypeId in (" + idList + ")";
        System.out.println(sql);
        jdbcTemplate.execute(sql);
        return Result.ok("删除成功");
    }



    //    修改商品
    @ResponseBody
    @RequestMapping(value = "/modSaleType", method = RequestMethod.POST)
    @Validated
    public Result modSaleType(@RequestBody SaleType mallType) {
        System.out.println("@@@@@@@@@@ modSaleType");
        System.out.println(mallType.toString());
        String dateNowStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTimeInMillis());
        System.out.println(dateNowStr);
        String sql ="UPDATE `market`.`saletype` SET " +
                "`saleTypeName` = '"+mallType.getSaleTypeName()+"', " +
                "`detail` = '"+mallType.getDetail()+"', " +
                " `updateTime` = '"+dateNowStr+"' " +
                "WHERE " +
                "`saleTypeId` = "+mallType.getSaleTypeId()+";";
        System.out.println(sql);
        jdbcTemplate.execute(sql);
        return Result.ok("修改成功");
    }



}
