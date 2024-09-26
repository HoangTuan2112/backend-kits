package com.kits.nhom3.Eccormerce.swagger;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Ecommerce API")
                        .version("1.0.0")
                        .description("API cho hệ thống Ecommerce nhom 3 kits")
                        .termsOfService("https://example.com/terms")
                        .contact(new Contact()
                                .name("Hỗ trợ API")
                                .email("tuanxyz113@gmail.com")
                                .url("https://example.com/contact"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("Thông tin thêm")
                        .url("https://example.com/docs"));
    }
}
