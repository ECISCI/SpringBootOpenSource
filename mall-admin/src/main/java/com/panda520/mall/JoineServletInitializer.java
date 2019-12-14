package com.panda520.mall;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author 玛丽莲梦明
 * @描述.Web容器中进行部署
 */
public class JoineServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MallAdminApplication.class);
    }
}
