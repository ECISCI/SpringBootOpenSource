package com.panda520.mall.api.controller;

import com.panda520.mall.api.annotation.PassAuth;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author  玛丽莲梦明
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/test")
    @PassAuth
    public String test() {
        return "HelloWorld";
    }
}
