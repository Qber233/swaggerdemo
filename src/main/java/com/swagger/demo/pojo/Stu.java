package com.swagger.demo.pojo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("学生实体类")
public class Stu {
    @ApiModelProperty("学号")
    public int id;
    @ApiModelProperty("姓名")
    public String name;
    @ApiModelProperty("年龄")
    public int age;
}
