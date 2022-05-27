package com.potato.marketweb.mapper;

import com.potato.marketweb.bean.MallType;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface MallMapper {
    //查找所有的商品种类
    @Select("SELECT * from malltype")
    List<MallType> getMallTypeList();

    //添加商品种类
    @Insert("insert malltype (typeName,addTime,detail) values('\" + #{typeName,jdbcType=VARCHAR} + \"','\" + #{addTime,jdbcType=VARCHAR} + \"','\" + #{detail,jdbcType=VARCHAR} + \"')")
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

}