package com.mike.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/app")
public class AppServerControllerTest {

    @RequestMapping(path = "/hello")
    @ResponseBody
    public String hello() {
        return "Hello";
    }

    @RequestMapping(path = "/latestDbVersion")
    @ResponseBody
    public Long getLatestDbVersion() {
        return 10001L;
    }

    @RequestMapping(path = "/db/{dbversion}")
    @ResponseBody
    public String getDbFileByVersion(@PathVariable("dbversion") Long dbversion) {
        if (10001 == dbversion) {
            return "https://www.jianshu.com/p/320cee90391f";
        }
        return "nil";
    }
}
