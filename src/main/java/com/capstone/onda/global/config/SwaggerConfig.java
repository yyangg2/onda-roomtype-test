package com.capstone.onda.global.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
            .version("v1.0.0")
            .title("[Capston] ONDA")
            .description("[Capston] ONDA Swagger 명세서 입니다");

        return new OpenAPI()
            .info(info);
    }
}
