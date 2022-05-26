package com.potato.marketweb.service;

import com.potato.marketweb.bean.SaleType;

import java.util.List;
import java.util.Map;

public interface SaleTypeService {
    List<Map> getIdNameFromSaleType();

    int delSaleType(String idList);

    List<SaleType> getSaleTypeList();
}
