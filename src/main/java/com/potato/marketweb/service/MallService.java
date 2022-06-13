package com.potato.marketweb.service;

import com.potato.marketweb.bean.MallType;

import java.util.List;
import java.util.Map;

public interface MallService {
    List<MallType> getMallTypeList();
    int addMallType(MallType mallType);
    int delMallType(String idList);
    List<Map> getIdNameFromMallType();
    int modMallType(MallType mallType);
    MallType getMallTypeByName(String malltypename);
}
