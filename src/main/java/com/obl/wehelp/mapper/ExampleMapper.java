package com.ohbang.wehelp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ExampleMapper {
    @Select("SELECT * FROM example WHERE id = #{id}")
    Object findById(Long id);
}
