package com.obl.wehelp.romapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ReadMapper {
    @Select("SELECT * FROM some_table WHERE id = #{id}")
    Object findById(int id);
}