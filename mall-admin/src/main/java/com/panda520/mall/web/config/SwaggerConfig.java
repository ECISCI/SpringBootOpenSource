package com.panda520.mall.web.config;

import com.panda520.mall.common.config.Global;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 玛丽莲梦明
 * @描述.Swagger2的接口配置
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Bean // 创建API
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                // 详细定制
                .apiInfo(apiInfo())
                // 设置哪些接口暴露给Swagger展示
                .select()
                // 扫描包
                .apis(RequestHandlerSelectors.basePackage("com.panda520.mall.web.controller.tool"))
                // 扫描所有 .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    //  添加摘要信息
    private ApiInfo apiInfo() {
        // 用ApiInfoBuilder进行定制
        return new ApiInfoBuilder()
                .title("熊猫商城管理系统接口文档")
                .description("用于管理集团旗下公司的人员信息,具体包括XXX,XXX模块...")
                .contact(new Contact(Global.getName(), null, null))
                .version(Global.getVersion())
                .build();
    }
}
