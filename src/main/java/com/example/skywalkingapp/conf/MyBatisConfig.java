package com.example.skywalkingapp.conf;

import com.example.skywalkingapp.tools.FullSQLInterceptor;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBatisConfig {
    @Bean
    ConfigurationCustomizer mybatisConfigurationCustomizer() {
        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                // customize ...
                configuration.addInterceptor(new FullSQLInterceptor());
            }
        };
    }
}