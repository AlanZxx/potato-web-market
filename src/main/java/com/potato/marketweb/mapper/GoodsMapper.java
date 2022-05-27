package com.potato.marketweb.mapper;

import com.potato.marketweb.bean.Goods;
import com.potato.marketweb.bean.SaleType;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface GoodsMapper {

    @Insert("INSERT INTO `market`.`goods` (`goodId`, `goodName`, `mallTypeId`, `saleTypeId`, `counts`, `detail`, `price`, `priceDis`, `discount`) VALUES \\n\" +\n" +
            "            \"(\"+goods.getGoodId()+\", '\"+goods.getGoodName()+\"', \"+goods.getTypeId()+\", \"+goods.getSaleTypeId()+\", \"+goods.getCounts()+\", '\"+goods.getDetail()+\"', \"+goods.getPrice()+\", \"+goods.getPriceDis()+\", \"+goods.getDiscount()+\");\\n")
    int addGoods(Goods goods);

    @Update("UPDATE `goods` \" +\n" +
            "                \"SET \" +\n" +
            "                \"`goodName` = '\"+goods.getGoodName()+\"', \" +\n" +
            "                \"`mallTypeId` = \"+goods.getTypeId()+\", \" +\n" +
            "                \"`saleTypeId` = \"+goods.getSaleTypeId()+\", \" +\n" +
            "                \"`counts` = \"+goods.getCounts()+\", \" +\n" +
            "                \"`price` = \"+goods.getPrice()+\", \" +\n" +
            "                \"`priceDis` = \"+goods.getPriceDis()+\", \" +\n" +
            "                \"`discount` = \"+goods.getDiscount()+\", \" +\n" +
            "                \"`detail` = '\"+goods.getDetail()+\"' \" +\n" +
            "                \"WHERE `goodId` = \"+goods.getGoodId()+\";")
    int modGoods(Goods goods);

    @Delete("delete from goods where goodid in (\" + idList + \")")
    int delGoods(String idList);

}
