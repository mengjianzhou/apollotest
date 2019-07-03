package com.testapollo.demo.bean;

import org.springframework.beans.factory.annotation.Value;

public class ApolloConfigBean{

    @Value("${name}")
    private String name;

    @Value("${age}")
    private Integer age;

    @Value("${test.abc.aaa.qqq}")
    private String qqq;

    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }

    public String getQqq(){
        return qqq;
    }

}
