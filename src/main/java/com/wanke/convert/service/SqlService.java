package com.wanke.convert.service;


import com.wanke.convert.dao.SqlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service(value = "sqlService")
public class SqlService {

    @Autowired
    private SqlMapper sqlMapper;

    public void testPLSQL() {
        int result = sqlMapper.testPLSQL();
        System.out.println(result);
    }

    public void normalInsertLog() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "baidu");
        map.put("2", "sina");
        map.put("3", "huawei");

        sqlMapper.normalInsertLog(map);
    }

    public void insertLog() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "baidu");
        map.put("2", "sina");
        map.put("3", "huawei");

        sqlMapper.insertLog(map);
    }

    public void singleInsert() {
        sqlMapper.singleInsert("5555");
    }
}
