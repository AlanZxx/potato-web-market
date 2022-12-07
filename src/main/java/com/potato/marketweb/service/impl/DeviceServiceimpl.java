package com.potato.marketweb.service.impl;

import com.potato.marketweb.bean.DeviceInfo;
import com.potato.marketweb.mapper.mysqlmapper.DeviceMapper;
import com.potato.marketweb.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DeviceService实现类
 *
 * @author desktop_spdb
 * @date 2022-12-06 13:36:14
 */
@Service("DeviceService")
public class DeviceServiceimpl implements DeviceService {
    @Autowired
    DeviceMapper deviceMapper;
    @Override
    public int addDeviceInfo(DeviceInfo deviceInfo) {
        return deviceMapper.addDeviceInfo(deviceInfo);
    }
}
