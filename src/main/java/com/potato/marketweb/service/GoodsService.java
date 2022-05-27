package com.potato.marketweb.service;

import com.potato.marketweb.bean.Goods;
import com.potato.marketweb.bean.MallType;

import java.util.List;
import java.util.Map;

public interface GoodsService {
    int addGoods(Goods goods);
    int modGoods(Goods goods);
    int delGoods(String idList);
}
