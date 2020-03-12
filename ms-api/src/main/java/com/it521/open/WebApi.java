package com.it521.open;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

/**
 * @author 玛丽莲梦明
 * @描述.启动程序
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, ErrorMvcAutoConfiguration.class})
@MapperScan("com.it521.open.*.mapper")
public class WebApi {
    public static void main(String[] args) {
        SpringApplication.run(WebApi.class, args);
    }
}