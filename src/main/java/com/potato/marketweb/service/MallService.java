package com.potato.marketweb.service;

import com.potato.marketweb.bean.MallType;

import java.util.List;
import java.util.Map;

public interface MallService {
    int addMallType(MallType mallType);
    int delMallTypeById(String idList);
    List <MallType> getMallTypeByLevel(int level);
    List<MallType> getMallTypeList();
    List<Map> getIdNameFromMallType();
    int modMallType(MallType mallType);
    MallType getMallTypeByName(String malltypename);
}
