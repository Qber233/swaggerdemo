package com.swagger.demo.config;


import io.swagger.models.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Bean
    public Docket docket0() {

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("hello")
                ;
    }

    @Bean
    public Docket docket() {

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.swagger.demo.controller"))
                .build()
                .groupName("test")
                ;
    }

    private ApiInfo apiInfo() {

        springfox.documentation.service.Contact contact = new springfox.documentation.service.Contact("cuber", "www.baidu.com", "372443809@qq.com");

        return new ApiInfo(
                "cuber的swagger",
                "态度决定话语权。",
                "bata",
                "www.baidu.com",
                contact,
                "no licence",
                "no",
                new ArrayList());
    }


}
