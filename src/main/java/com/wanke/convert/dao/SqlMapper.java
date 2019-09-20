package com.wanke.convert.dao;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface SqlMapper {

    int testPLSQL();

    void normalInsertLog(@Param("map") Map<String, String> map);

    void insertLog(@Param("map") Map<String, String> map);

    void singleInsert(@Param("log") String log);
}
