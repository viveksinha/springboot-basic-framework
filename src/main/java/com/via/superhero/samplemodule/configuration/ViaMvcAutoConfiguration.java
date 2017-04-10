package com.via.superhero.samplemodule.configuration;

import com.via.superhero.samplemodule.interceptor.ViaMvcInterceptor;
import com.via.superhero.samplemodule.support.EnvironmentProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Vivek Wiki
 */
@Configuration
@EnableConfigurationProperties
public class ViaMvcAutoConfiguration extends WebMvcConfigurerAdapter {

    @Autowired
    public EnvironmentProperties environmentProperties;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ViaMvcInterceptor());
    }
}
