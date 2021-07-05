package com.swagger.demo.controller;


import com.swagger.demo.pojo.Stu;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@ApiOperation("hello控制类")
@RestController
public class HelloController {

    @ApiOperation("hello控制类")
    @PostMapping("hello")
    public String hello(){
        return "hello";
    }

    @ApiOperation("Stu控制类")
    @PostMapping("sut")
    public Stu stu(@ApiParam("年龄")int age,@ApiParam("姓名")String name){
        return new Stu();
    }

    @ApiOperation("Stu控制类264")
    @PostMapping("sut123")
    public Stu stu123(@ApiParam("年龄")int age,@ApiParam("姓名")String name){
        return new Stu();
    }

}
