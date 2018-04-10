package com.lenovo.ailib.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**  
* Title: SwaggerConfig  
* Description:  
* @author "chenpeng"  
* @date 2018年4月10日  
*/  
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.lenovo.ailib"))//扫描 路径下的api文档
                .paths(PathSelectors.any())//路径判断
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger spring-boot example")//标题
                .description("Saggger 开发规范详文档细地址：www.lenovo.com")//描述
                .termsOfServiceUrl("http://www.lenovo.com")//（不可见）条款地址
                .version("1.0.1")//版本号
                .build();
    }

}
