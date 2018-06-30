package com.gegz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
public class UploadConfig {

    @Bean
    public CommonsMultipartResolver filterMultipartResolver() {
        CommonsMultipartResolver filterMultipartResolver = new CommonsMultipartResolver();
        filterMultipartResolver.setDefaultEncoding("UTF-8");
        filterMultipartResolver.setMaxUploadSize(524288000);
        filterMultipartResolver.setMaxInMemorySize(4096);
        return filterMultipartResolver;
    }
}
