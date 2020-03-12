package com.it521.open;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 玛丽莲梦明
 * @描述.启动程序
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.it521.open.*.mapper")
public class WebAdmin {
    public static void main(String[] args) {
        SpringApplication.run(WebAdmin.class, args);
    }
}