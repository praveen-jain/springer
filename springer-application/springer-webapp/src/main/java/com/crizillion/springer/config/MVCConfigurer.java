package com.crizillion.springer.config;

import org.springframework.boot.autoconfigure.web.ConditionalOnEnabledResourceChain;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.ResourceUrlEncodingFilter;

@Component
public class MVCConfigurer implements WebMvcConfigurer {

    /**
     * Define the ResourceUrlEncodingFilter as a bean. 
     * Add the <code>@ConditionalOnEnabledResourceChain</code> 
     * to ensure that the resource chain property 
     * <code>spring.resources.chain.enabled=true</code> 
     * is set to true in the <code>application.properties</code> file.
     */
    @Bean
    @ConditionalOnEnabledResourceChain
    public ResourceUrlEncodingFilter resourceUrlEncodingFilter() {
        return new ResourceUrlEncodingFilter();
    }
}