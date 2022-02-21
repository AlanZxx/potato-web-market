package com.potato.marketweb.controller.mall;

import com.potato.marketweb.commonUtil.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
        System.out.println("getMallTypeList");
        //访问数据库user表，查询user表的数据量
        List mallTypes = jdbcTemplate.queryForList("SELECT * from malltype");
        System.out.println(mallTypes.size());
        return Result.ok(mallTypes);
    }

    //    新增种类
    @ResponseBody
    @RequestMapping(value = "/addMallType", method = RequestMethod.POST)
    @Validated
    public Result addMallType(@RequestParam(value = "name") String name, @RequestParam(value = "detail", required = false) String detail) {
        System.out.println(name);
        System.out.println(detail);
        List mallTypes = jdbcTemplate.queryForList("SELECT * from malltype where typeName = " + name);
        if (mallTypes.size() != 0) {
            return Result.fail("当前已有种类");
        }
        String dateNowStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTimeInMillis());
        System.out.println(dateNowStr);
        String sql = "insert malltype (typeName,addTime,detail) values('" + name + "','" + dateNowStr + "','" + detail + "')";
        System.out.println(sql);
        jdbcTemplate.execute(sql);
        return Result.ok("添加成功");
    }

    //    删除种类
    @ResponseBody
    @RequestMapping(value = "/delMallType", method = RequestMethod.POST)
    @Validated
    public Result delMallType(@RequestParam(value = "idList", required = false) String idList) {
        String sql = "delete from malltype where typeId in (" + idList + ")";
        System.out.println(sql);
        jdbcTemplate.execute(sql);
        return Result.ok("删除成功");
    }

    //    修改种类
    @ResponseBody
    @RequestMapping(value = "/modMallType", method = RequestMethod.POST)
    @Validated
    public Result modMallType(@RequestParam(value = "requestData", required = false) String requestData) {
        System.out.println(requestData);
//        String sql = "delete from malltype where typeId in (" + idList + ")";
//        System.out.println(sql);
//        jdbcTemplate.execute(sql);
        return Result.ok("修改成功");
    }
}
