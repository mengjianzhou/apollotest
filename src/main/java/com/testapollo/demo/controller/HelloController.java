package com.testapollo.demo.controller;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import com.testapollo.demo.bean.ApolloConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    private ApolloConfigBean apolloConfigBean;

    @RequestMapping("hello")
    public @ResponseBody String sayHello(){

        String name = apolloConfigBean.getName();
        System.out.println("@@@@name"+name);
        System.out.println("@@@@age"+apolloConfigBean.getAge());
        System.out.println("@@@qqq"+apolloConfigBean.getQqq());
        return name;
    }
}
