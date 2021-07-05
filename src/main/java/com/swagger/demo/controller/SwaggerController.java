package com.swagger.demo.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SwaggerController {

    @ApiOperation("test控制类")
    @PostMapping("test")
    public int test(int age){

        return age+10;
    }

}
