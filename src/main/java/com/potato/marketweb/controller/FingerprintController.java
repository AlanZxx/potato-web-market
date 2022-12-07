package com.potato.marketweb.controller;

import com.google.gson.Gson;
import com.potato.marketweb.bean.DeviceInfo;
import com.potato.marketweb.bean.Goods;
import com.potato.marketweb.commonUtil.Result;
import com.potato.marketweb.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 设备指纹相关接口
 *
 * @author desktop_spdb
 * @date 2022-12-06 11:08:59
 */
@Controller
public class FingerprintController {
    //    设备指纹信息录入
    @Autowired
    DeviceService deviceService;

    @ResponseBody
    @RequestMapping(value = "/insertDeviceInfo", method = RequestMethod.POST)
    @Validated
    public Result insertData(String deviceinfo) {
        try {
            String dateNowStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTimeInMillis());
            Gson gson = new Gson();
            DeviceInfo deviceInfo1 = gson.fromJson(deviceinfo, DeviceInfo.class);
            deviceInfo1.setInsert_time(dateNowStr);
            if (deviceService.addDeviceInfo(deviceInfo1) > 0) {
                System.out.println("success");
                return Result.success("添加成功");
            }else{
                System.out.println("fail");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return Result.failed(e.getMessage());
        }
        return Result.failed();
    }
}
