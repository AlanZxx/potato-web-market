package com.potato.marketweb.mapper;

import com.potato.marketweb.bean.SaleType;
import com.potato.marketweb.commonUtil.Result;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface SaleTypeMapper {

    @Select("SELECT saleTypeId as id,saleTypeName as name from saletype")
    List<Map> getIdNameFromSaleType();
    @Delete("delete from saletype where saleTypeId in (\" + #{idList,jdbcType=INTEGER} + \")")
    int delSaleType(String idList);
    @Select("select * from saleType")
    List<SaleType> getSaleTypeList();
}
