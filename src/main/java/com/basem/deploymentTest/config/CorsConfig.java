package com.basem.deploymentTest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Allow all paths
                        .allowedOriginPatterns("*")// Allow all origins
                        .allowedMethods("*") // Allow all methods (GET, POST, etc.)
                        .allowedHeaders("*")
                        .allowCredentials(true);// Allow all headers
            }
        };
    }
}