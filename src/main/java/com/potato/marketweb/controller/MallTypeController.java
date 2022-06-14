package com.potato.marketweb.controller;

import com.potato.marketweb.bean.MallType;
import com.potato.marketweb.commonUtil.CommonUtil;
import com.potato.marketweb.commonUtil.Result;
import com.potato.marketweb.service.MallService;
import com.potato.marketweb.service.SaleTypeService;
import com.sun.deploy.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLIntegrityConstraintViolationException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MallTypeController {
    @Autowired
    MallService mallServicel;
    @Autowired
    SaleTypeService saleTypeService;

    //    查询所有列表
    @ResponseBody
    @RequestMapping(value = "/getAllMallTypeList", method = RequestMethod.GET)
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
        if(mallServicel.getMallTypeByName(mallType.getMallTypeName())!=null){
            return Result.failed("当前种类已存在，请勿重复添加");
        }
        String dateNowStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTimeInMillis());
        mallType.setCreateTime(dateNowStr);
        mallType.setUpdateTime(dateNowStr);
        mallType.setCreateOpId(CommonUtil.getUserId());
        mallType.setUpdateOpId(CommonUtil.getUserId());
        if (mallServicel.addMallType(mallType) == 1) {
            return Result.success("添加成功");
        } else {
            return Result.failed("添加失败");
        }
    }


    //    删除种类
    @ResponseBody
    @RequestMapping(value = "/delMallTypeByid", method = RequestMethod.POST)
    @Validated
    public Result delMallTypeByid(@RequestBody List<String> idList) {
        if(idList.isEmpty()){
            return Result.failed("无可删除商品种类");
        }
        String sbIdList = "'"+ StringUtils.join(idList,"','")+"'";
        if (mallServicel.delMallTypeById(sbIdList) > 0) {
            return Result.success("删除成功");
        } else {
            return Result.failed("删除失败");
        }
    }


    //根据级别获取种类
    @ResponseBody
    @RequestMapping(value = "/getMallTypeByLevel", method = RequestMethod.POST)
    @Validated
    public Result getMallTypeByLevel(@RequestBody int mallTypeLevel) {
        List mallTypes = mallServicel.getMallTypeByLevel(mallTypeLevel);
        return Result.success(mallTypes);
    }

    //根据id获取种类
    @ResponseBody
    @RequestMapping(value = "/getMallTypeById", method = RequestMethod.POST)
    @Validated
    public Result getMallTypeById(Integer id) {
        Map<String, List> resultMap = new HashMap<>();
        List mallTypes = mallServicel.getIdNameFromMallType();
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
