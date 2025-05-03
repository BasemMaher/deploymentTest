package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Apply to all paths
                        .allowedOrigins("*") // Allow all origins (change this in production)
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH") // Allow these methods
                        .allowedHeaders("*") // Allow all headers (helps avoid OPTIONS issues)
                        .allowCredentials(false); // Set to true if using cookies/auth headers
            }
        };
    }
}
