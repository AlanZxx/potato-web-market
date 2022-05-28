package com.potato.marketweb.service.impl;

import com.potato.marketweb.bean.Goods;
import com.potato.marketweb.mapper.GoodsMapper;
import com.potato.marketweb.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GoodsService")
public class GoodsServiceimpl implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public int addGoods(Goods goods) {
        return goodsMapper.addGoods(goods);
    }

    @Override
    public int modGoods(Goods goods) {
        return goodsMapper.modGoods(goods);
    }

    @Override
    public int delGoods(String idList) {
        return goodsMapper.delGoods(idList);
    }

    @Override
    public Goods queryGoodsById(String goodName) {
        return goodsMapper.queryGoodsById(goodName);
    }

    ;
}
