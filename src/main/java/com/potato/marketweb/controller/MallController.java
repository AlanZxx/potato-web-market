package com.potato.marketweb.controller;

import com.potato.marketweb.bean.MallType;
import com.potato.marketweb.commonUtil.Result;
import com.potato.marketweb.service.MallService;
import com.potato.marketweb.service.SaleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MallController {
    @Autowired
    MallService mallServicel;
    @Autowired
    SaleTypeService saleTypeService;

    //    查询所有列表
    @ResponseBody
    @RequestMapping("/getMallTypeList")
    public Result getMallTypeList() {
        //访问数据库user表，查询user表的数据量
        List mallTypes = mallServicel.getMallTypeList();
        return Result.success(mallTypes);
    }

    //    新增种类
    @ResponseBody
    @RequestMapping(value = "/addMallType", method = RequestMethod.POST)
    @Validated
    public Result addMallType(@RequestBody MallType mallType) {
//        List mallTypes = jdbcTemplate.queryForList("SELECT * from malltype where typeName = '" + mallType.getTypeName()+"'");
//        if (mallTypes.size() != 0) {
////            return Result.fail("当前已有种类");
//        }
        String dateNowStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTimeInMillis());
        int a = mallServicel.addMallType(new MallType());
        if (a == 1) {
            return Result.success("添加成功");
        } else {
            return Result.failed();
        }
    }

    //    删除种类
    @ResponseBody
    @RequestMapping(value = "/delMallType", method = RequestMethod.POST)
    @Validated
    public Result delMallType(@RequestParam(value = "idList", required = false) String idList) {
        if (mallServicel.delMallType(idList) > 0) {
            return Result.success("删除成功");
        } else {

            return Result.failed("添加成功");
        }
    }


    //获取所有种类列表
    @ResponseBody
    @RequestMapping(value = "/getMallTypeIdList", method = RequestMethod.GET)
    @Validated
    public Result getMallTypeIdList() {
        Map<String, List> resultMap = new HashMap<>();
        //访问数据库user表，查询user表的数据量
        List mallTypes = mallServicel.getIdNameFromMallType();
        List saleTypes = saleTypeService.getIdNameFromSaleType();
        resultMap.put("mallTypeList", mallTypes);
        resultMap.put("saleTypeList", saleTypes);
        return Result.success(resultMap);
    }


    //    修改商品种类
    @ResponseBody
    @RequestMapping(value = "/modMallType", method = RequestMethod.POST)
    @Validated
    public Result modMallType(@RequestBody MallType mallType) {
        String dateNowStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTimeInMillis());
        int i = mallServicel.modMallType(mallType);
        if (i > 0) {
            return Result.success("修改成功");
        } else {
            return Result.failed();
        }
    }


}
