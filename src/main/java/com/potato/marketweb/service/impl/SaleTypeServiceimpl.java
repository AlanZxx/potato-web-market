package com.potato.marketweb.service.impl;

import com.potato.marketweb.bean.SaleType;
import com.potato.marketweb.mapper.mysqlmapper.SaleTypeMapper;
import com.potato.marketweb.service.SaleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("SaleTypeService")
public class SaleTypeServiceimpl implements SaleTypeService {
    @Autowired
    SaleTypeMapper saleTypeMapper;
    @Override
    public List<Map> getIdNameFromSaleType() {
        return saleTypeMapper.getIdNameFromSaleType();
    }

    @Override
    public int delSaleType(String idList) {
        return saleTypeMapper.delSaleType(idList);
    }

    @Override
    public List<SaleType> getSaleTypeList() {
        return saleTypeMapper.getSaleTypeList();
    }

    @Override
    public int addSaleType(SaleType saleType) {
        return saleTypeMapper.addSaleType(saleType);
    }
}
