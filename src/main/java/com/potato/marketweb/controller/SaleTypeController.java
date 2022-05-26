package com.potato.marketweb.controller;

import com.potato.marketweb.commonUtil.Result;
import com.potato.marketweb.mapper.SaleTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SaleTypeController {
    @Autowired
    SaleTypeMapper saleTypeMapper;

    //    删除销售方式
    @ResponseBody
    @RequestMapping(value = "/delSaleType", method = RequestMethod.POST)
    @Validated
    public Result delSaleType(@RequestParam(value = "idList", required = false) String idList) {
        if (saleTypeMapper.delSaleType(idList)>0){
            return Result.success("删除成功");
        }else{
            return  Result.failed();
        }
    }


    //    查询售卖方式列表
    @ResponseBody
    @RequestMapping("/getSaleTypeList")
    public Result getSaleTypeList() {
        return Result.success(saleTypeMapper.getSaleTypeList());
    }
}
