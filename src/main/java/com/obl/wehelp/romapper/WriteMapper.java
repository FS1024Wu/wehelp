package com.obl.wehelp.romapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WriteMapper {
    @Insert("INSERT INTO some_table (name, value) VALUES (#{name}, #{value})")
    void insert(Object entity);
}