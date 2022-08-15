package com.potato.marketweb.mapper.mysqlmapper;

import com.potato.marketweb.bean.Goods;
import org.apache.ibatis.annotations.*;


@Mapper
public interface GoodsMapper {

    @Insert("INSERT INTO `market`.`goods` ( `goodId`, `goodName`, `mallTypeId`, `saleTypeId`, `counts`, `detail`, `price`, `priceDis`, `discount`,`createTime`, `updateTime` )\n" +
            "VALUES\n" +
            "\t( #{goodId,jdbcType=VARCHAR},#{goodName,jdbcType=VARCHAR},#{mallTypeId},#{saleTypeId},#{counts},#{detail,jdbcType=VARCHAR},#{price},#{priceDis},#{discount},#{createTime,jdbcType=VARCHAR},#{updateTime,jdbcType=VARCHAR});")
    int addGoods(Goods goods);

    @Update("UPDATE `market`.`goods` \n" +
            "SET `goodName` = #{goodName,jdbcType=VARCHAR},\n" +
            "`mallTypeId` =#{mallTypeId} ,\n" +
            "`saleTypeId` = #{saleTypeId},\n" +
            "`counts` = #{counts},\n" +
            "`detail` = #{detail,jdbcType=VARCHAR},\n" +
            "`price` = #{price},\n" +
            "`priceDis` =#{priceDis} ,\n" +
            "`discount` = #{discount},\n" +
            "`updateTime` =  #{updateTime,jdbcType=VARCHAR}\n" +
            "WHERE\n" +
            "\t`goodId` = #{goodId,jdbcType=VARCHAR};")
    int modGoods(Goods goods);

    @Delete("delete from goods where goodid in ( ${idList})")
    int delGoods(String idList);

    @Select("select * from goods where goodId = #{goodId,jdbcType=VARCHAR};")
    Goods queryGoodsById(String goodId);

}
