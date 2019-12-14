package com.panda520.mall.quartz.task;

import org.springframework.stereotype.Component;

/**
 * @描述.定时任务调度测试
 *
 * @author 玛丽莲梦明
 */
@Component("jeTask")
public class JeTask {
    public void jeParams(String params) {
        System.out.println("执行有参方法：" + params);
    }

    public void jeNoParams() {
        System.out.println("执行无参方法");
    }
}
