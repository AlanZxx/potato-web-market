package com.potato.marketweb.service.impl;

import com.potato.marketweb.bean.Goods;
import com.potato.marketweb.bean.MallType;
import com.potato.marketweb.mapper.MallMapper;
import com.potato.marketweb.service.GoodsService;
import com.potato.marketweb.service.MallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("GoodsService")
public class GoodsServiceimpl implements GoodsService {
    @Autowired
    GoodsService goodsService;

    @Override
    public int addGoods(Goods goods) {
        return goodsService.addGoods(goods);
    }

    @Override
    public int modGoods(Goods goods) {
        return goodsService.modGoods(goods);
    }

    @Override
    public int delGoods(String idList) {
        return goodsService.delGoods(idList);
    }

}
