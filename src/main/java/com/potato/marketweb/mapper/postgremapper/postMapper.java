package com.potato.marketweb.mapper.postgremapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface postMapper {
    @Select("select count(*) from test_table")
    int getAllTest();
}
