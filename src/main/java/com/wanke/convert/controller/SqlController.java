package com.wanke.convert.controller;

import com.wanke.convert.service.SqlService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SqlController {

    @Autowired
    private SqlService sqlService;

    @ApiOperation(value = "query 查询，不拦截", notes = "正常查询")
    @RequestMapping(value = {"/testPLSQL"}, method = RequestMethod.GET)
    public void testPLSQL() {
        sqlService.testPLSQL();
    }

    @ApiOperation(value = "update 多条插入，拦截，非 PL/SQL", notes = "正常插入")
    @RequestMapping(value = {"/normalInsertLog"}, method = RequestMethod.POST)
    public void normalInsertLog() {
        sqlService.normalInsertLog();
    }

    @ApiOperation(value = "update 多条插入 PL/SQL，拦截, 没有 CALLABLE 标记", notes = "报异常")
    @RequestMapping(value = {"/insertLog"}, method = RequestMethod.POST)
    public void insertLog() {
        sqlService.insertLog();
    }


    @ApiOperation(value = "update 单条插入 PL/SQL，拦截, 带有 CALLABLE 标记", notes = "正常插入")
    @RequestMapping(value = {"/singleInsert"}, method = RequestMethod.POST)
    public void singleInsert() {
        sqlService.singleInsert();
    }
}
