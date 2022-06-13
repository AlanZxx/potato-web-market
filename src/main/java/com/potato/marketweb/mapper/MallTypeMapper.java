package com.potato.marketweb.mapper;

import com.potato.marketweb.bean.MallType;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface MallTypeMapper {
    //查找所有的商品种类
    @Select("SELECT * from malltype")
    List<MallType> getMallTypeList();

    //添加商品种类
    @Insert("INSERT INTO `market`.`malltype` ( `mallTypeName`, `mallCounts`, `mallTypeStatus`, `createTime`, `updateTime`, `detail`, `createOpId`, `updateOpId`, `mallTypeLevel`, `parentId` )\n" +
            "VALUES\n" +
            "\t( #{mallTypeName}, #{mallCounts}, #{mallTypeStatus}, #{createTime}, #{updateTime}, #{detail}, #{createOpId}, #{updateOpId}, #{mallTypeLevel}, #{parentId} );")
    int addMallType(MallType mallType);

    //添加商品种类
    @Delete("delete from malltype where typeId in #{idList,jdbcType=INTEGER}")
    int delMallType(String idList);

    @Select("SELECT typeId as id,typeName as name from malltype")
    List<Map> getIdNameFromMallType();

    @Update("UPDATE `malltype` \\n\" +\n" +
            "                \"SET `typeName` = '\"+#{typeName,jdbcType=VARCHAR}+\"',\\n\" +\n" +
            "                \"`updateTime` = '\"+#{updateTime,jdbcType=VARCHAR}+\"',\\n\" +\n" +
            "                \"`detail` = '\"+#{detail,jdbcType=VARCHAR}+\"' \\n\" +\n" +
            "                \"WHERE\\n\" +\n" +
            "                \"\\t`typeId` = \"+#{typeId,jdbcType=VARCHAR}")
    int modMallType(MallType mallType);


    @Select("SELECT * from malltype where ")
    MallType getMallTypeByid(Integer id);


    @Select("select * from malltype where malltypename = #{malltypename}")
    MallType getMallTypeByName(String malltypename);
}
