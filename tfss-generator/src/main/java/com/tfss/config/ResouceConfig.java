package com.tfss.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by tfss on 2019/7/14.
 */
@Configuration
public class ResouceConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String path = System.getProperty("user.dir");
        registry.addResourceHandler("/result/**").addResourceLocations("file:" + path + "/result/");
        super.addResourceHandlers(registry);
    }
}
