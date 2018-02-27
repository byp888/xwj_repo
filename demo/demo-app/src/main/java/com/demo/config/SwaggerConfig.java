package com.demo.config;

import static com.google.common.base.Predicates.*;
import static springfox.documentation.builders.PathSelectors.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * RestFul API生成配置
 * 
 * <pre>
 * 查看api路径为http://localhost:8081/swagger-ui.html
 * </pre>
 * 
 * @author zhangyue
 *
 */
@Configuration
@EnableSwagger2
@Profile("api-doc")
public class SwaggerConfig {

    private static String TERMS_OF_SERVICE_URL = "http://www.demo.com";
    
    @Bean // Don't forget the @Bean annotation
    public Docket applyImplementation() {
        // @formatter:off
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("demo-api")
                .select()
                //.paths(demoPaths()).build()
                .paths(PathSelectors.any()).build()
                //.apis(RequestHandlerSelectors.basePackage("com.demo.template")).build() 
                .apiInfo(demoApiInfo());
        // @formatter:on
    }
    
    private ApiInfo demoApiInfo() {
       // @formatter:off
       return new ApiInfoBuilder()
               .title("demo服务各种API")
               .description("提供增删改查等业务接口")
               .termsOfServiceUrl(TERMS_OF_SERVICE_URL)
               .contact(new Contact("xuwenjin", "http://www.baidu.com", "xuwjf@yonyou.com")) 
               .version("1.0")
               .build();
       // @formatter:on
   }
    
    @SuppressWarnings("unchecked")
    private Predicate<String> demoPaths() {
        return or(regex("/template.*"));
    }
    
}
