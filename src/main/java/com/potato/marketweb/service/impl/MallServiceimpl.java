package com.potato.marketweb.service.impl;

import com.potato.marketweb.bean.MallType;
import com.potato.marketweb.mapper.MallMapper;
import com.potato.marketweb.service.MallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("MallService")
public class MallServiceimpl implements MallService {
    @Autowired
    MallMapper mallMapper;

    @Override
    public List<MallType> getMallTypeList() {
        List<MallType> list = mallMapper.getMallTypeList();
        return list;
    }

    @Override
    public int addMallType(MallType mallType) {
        return mallMapper.addMallType(mallType);
    }

    @Override
    public int delMallType(String idList) {
        return mallMapper.delMallType(idList);
    }

    @Override
    public List<Map> getIdNameFromMallType() {
        return mallMapper.getIdNameFromMallType();
    }

    public int modMallType(MallType mallType) {
        return mallMapper.modMallType(mallType);
    }

}
