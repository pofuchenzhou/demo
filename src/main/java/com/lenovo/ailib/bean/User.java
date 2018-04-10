package com.lenovo.ailib.bean;

import io.swagger.annotations.ApiModelProperty;


//@ApiModel(description = "我是描述",discriminator = "I am discriminator",value = "用户")
public class User {
	
    @ApiModelProperty(value = "id",required = true)
    private Long id;
    @ApiModelProperty(value = "用戶名")
    private String name;
   
    @ApiModelProperty(value = "年齡")
    private Integer age;

//    @ApiModelProperty(value = "用户的子类，测试用",required = true)
//    private Base base;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
