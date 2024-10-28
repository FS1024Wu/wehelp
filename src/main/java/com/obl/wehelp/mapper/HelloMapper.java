package com.obl.wehelp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HelloMapper {
    @Select("SELECT 'Hello, WeHelp!'")
    String getGreeting();
}
