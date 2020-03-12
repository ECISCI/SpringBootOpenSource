package com.it521.open;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

/**
 * @描述.手机api接口
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, ErrorMvcAutoConfiguration.class})
@MapperScan("com.it521.open.*.mapper")
public class OpenApi {

    public static void main(String[] args) {
        SpringApplication.run(OpenApi.class, args);
    }

}
