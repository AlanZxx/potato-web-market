package com.potato.marketweb.controller;

import com.potato.marketweb.bean.SaleType;
import com.potato.marketweb.commonUtil.Result;
import com.potato.marketweb.mapper.SaleTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@Controller
public class SaleTypeController {
    @Autowired
    SaleTypeMapper saleTypeMapper;

    //    删除销售方式
    @ResponseBody
    @RequestMapping(value = "/delSaleType", method = RequestMethod.POST)
    @Validated
    public Result delSaleType(@RequestParam(value = "idList", required = false) String idList) {
        if (saleTypeMapper.delSaleType(idList) > 0) {
            return Result.success("删除成功");
        } else {
            return Result.failed();
        }
    }


    //    查询售卖方式列表
    @ResponseBody
    @RequestMapping("/getSaleTypeList")
    public Result getSaleTypeList() {
        return Result.success(saleTypeMapper.getSaleTypeList());
    }


    //    新增销售方式
    @ResponseBody
    @RequestMapping(value = "/addSaleType", method = RequestMethod.POST)
    @Validated
    public Result addSaleType(@RequestBody SaleType saleType) {
//        List goodlist = jdbcTemplate.queryForList("SELECT * from goods where goodName = '" + saleType.getSaleTypeName()+"'");
//        if (goodlist.size() != 0) {
////            return Result.fail("当前商品已存在");
//        }
        String dateNowStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTimeInMillis());
        if (saleTypeMapper.addSaleType(saleType) > 0) {
            return Result.success("添加成功");
        } else {
            return Result.failed();
        }
    }

}
