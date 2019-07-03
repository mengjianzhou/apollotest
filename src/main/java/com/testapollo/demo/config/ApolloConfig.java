package com.testapollo.demo.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.testapollo.demo.bean.ApolloConfigBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableApolloConfig
public class ApolloConfig {

    @Bean
    public ApolloConfigBean testBean() {
        return new ApolloConfigBean();
    }
}
