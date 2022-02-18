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

    @ResponseBody
    @RequestMapping("/getMallTypeList")
    public Result getMallTypeList() {
        System.out.println("getMallTypeList");
        //访问数据库user表，查询user表的数据量
        List mallTypes = jdbcTemplate.queryForList("SELECT * from malltype");
        System.out.println(mallTypes.size());
        return Result.ok(mallTypes);
    }

    @ResponseBody
    @RequestMapping(value = "/addMallType", method = RequestMethod.POST)
    @Validated
    public Result addMallType(@RequestParam(value = "name") String name, @RequestParam(value = "detail", required = false) String detail) {
        System.out.println(name);
        System.out.println(detail);
//        List<MallType>  mallTypes = jdbcTemplate.queryForList("SELECT * from malltype where typeName = "+ name, MallType.class);
//        if(mallTypes.size()!=0){
//            return Result.fail("当前已有种类");
//        }
//        jdbcTemplate.execute("insert malltype (typeName) values("+name+")");
        return Result.ok("添加成功");
    }
}
