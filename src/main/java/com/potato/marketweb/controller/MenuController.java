package com.potato.marketweb.controller;

import com.potato.marketweb.commonUtil.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class MenuController {

    @ResponseBody
    @RequestMapping("/getMenuDataList")
    public Result getMenuDataList() {
        List<Map<String, Object>> tableDataList = new ArrayList<>();
        List<Map<String, Object>> tableLabelList = new ArrayList<>();
        List<Map<String, Object>> countDataList = new ArrayList<>();
        Map<String, Object> resultMap = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("name", "名称" + i);
            map.put("todayBuy", (int) (Math.random() * 100));
//            map.put("todayBuy", Math.random() * 100);
            map.put("monthBuy", (int) (Math.random() * 20));
            map.put("totalBuy", (int) (Math.random() * 50));
            tableDataList.add(map);
        }
        for (int i = 0; i < 6; i++) {
            Map<String, Object> temp = new HashMap();
            temp.put("name", "今日支付订单" + i);
            temp.put("value", (int) (Math.random() * 100));
            temp.put("icon", "success");
            temp.put("color", "#2ec7c9");
            countDataList.add(temp);
        }
        resultMap.put("tableData", tableDataList);
        resultMap.put("tableLabel", tableLabelList);
        resultMap.put("countData", countDataList);
        return Result.success(resultMap);
    }
}
