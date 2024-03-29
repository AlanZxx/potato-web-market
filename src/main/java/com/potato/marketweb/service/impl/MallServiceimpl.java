package com.potato.marketweb.service.impl;

import com.potato.marketweb.bean.MallType;
import com.potato.marketweb.mapper.mysqlmapper.MallTypeMapper;
import com.potato.marketweb.service.MallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("MallService")
public class MallServiceimpl implements MallService {
    @Autowired
    MallTypeMapper mallTypeMapper;


    @Override
    public int addMallType(MallType mallType) {
        return mallTypeMapper.addMallType(mallType);
    }

    @Override
    public int delMallTypeById(String idList) {
        return mallTypeMapper.delMallTypeById(idList);
    }

    @Override
    public List<MallType> getMallTypeByLevel(int level) {
        return mallTypeMapper.getMallTypeByLevel(level);
    }

    @Override
    public List<MallType> getMallTypeList() {
        List<MallType> list = mallTypeMapper.getMallTypeList();
        return list;
    }
    @Override
    public List<Map> getIdNameFromMallType() {
        return mallTypeMapper.getIdNameFromMallType();
    }

    public int modMallType(MallType mallType) {
        return mallTypeMapper.modMallType(mallType);
    }


    public MallType getMallTypeByid(Integer id) {
        return mallTypeMapper.getMallTypeByid(id);
    }

    public MallType getMallTypeByName(String malltypename) {
        return mallTypeMapper.getMallTypeByName(malltypename);
    }
}
