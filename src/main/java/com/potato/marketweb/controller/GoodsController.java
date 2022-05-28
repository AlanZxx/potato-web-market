package com.potato.marketweb.controller;

import com.potato.marketweb.bean.Goods;
import com.potato.marketweb.commonUtil.Result;
import com.potato.marketweb.service.GoodsService;
import com.sun.deploy.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Controller
public class GoodsController {
    @Autowired
    GoodsService goodsService;

    //    新增商品
    @ResponseBody
    @RequestMapping(value = "/addGoods", method = RequestMethod.POST)
    @Validated
    public Result addGoods(@RequestBody Goods goods) {
        String dateNowStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTimeInMillis());
        if (goodsService.queryGoodsById(goods.getGoodId()) != null) {
            return Result.failed("当前商品已存在");
        }
        goods.setUpdateTime(dateNowStr);
        goods.setCreateTime(dateNowStr);
        if (goodsService.addGoods(goods) > 0) {
            return Result.success("添加成功");
        } else {
            return Result.failed();
        }

    }


    //    修改商品
    @ResponseBody
    @RequestMapping(value = "/modGoods", method = RequestMethod.POST)
    @Validated
    public Result modGoods(@RequestBody Goods goods) {
        String dateNowStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTimeInMillis());
        if (goodsService.queryGoodsById(goods.getGoodId()) == null) {
            return Result.failed("当前商品不存在");
        }
        goods.setUpdateTime(dateNowStr);
        if (goodsService.modGoods(goods) > 0) {
            return Result.success("修改成功");
        } else {
            return Result.failed("修改失败");
        }
    }


//    //    查询商品列表
//    @ResponseBody
//    @RequestMapping("/getGoodList")
//    public Result getGoodList() {
//        System.out.println("@@@@@@@@@@ getGoodList");
//        String sql = "SELECT * from goods g left join saletype s on  g.saletypeId = s.saleTypeId\n" +
//                "left join malltype m on g.mallTypeId = m.typeId";
//        System.out.println(sql);
//        List mallTypes = jdbcTemplate.queryForList(sql);
//        System.out.println(mallTypes.size());
////        return Result.ok(mallTypes);
//    }


    //    删除商品
    @ResponseBody
    @RequestMapping(value = "/delGoods", method = RequestMethod.POST)
    @Validated
    public Result delGoods(@RequestBody List<String> idList) {
        if(idList.isEmpty()){
            return Result.failed("无可删除商品");
        }
        String sbIdList = "'"+ StringUtils.join(idList,"','")+"'";
        if (goodsService.delGoods(sbIdList) > 0) {
            return Result.success("删除成功");
        } else {
            return Result.failed("删除失败");
        }
    }


    //    根据id查询商品
    @ResponseBody
    @RequestMapping(value = "/queryGoodById", method = RequestMethod.GET)
    @Validated
    public Result queryGoodById(@RequestBody String goodId) {
        Goods goods = goodsService.queryGoodsById(goodId);
        if (goods == null) {
            return Result.failed("当前商品不存在");
        }else{
            return Result.success(goods);
        }
    }



}
