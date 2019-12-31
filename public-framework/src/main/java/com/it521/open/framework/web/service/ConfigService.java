package com.it521.open.framework.web.service;

import com.it521.open.system.service.ISysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author X
 */
@Service("config")
public class ConfigService {
    @Autowired
    private ISysConfigService configService;

    /**
     * 根据键名查询参数配置信息
     *
     * @param configKey 参数键值
     * @return 参数值
     */
    public String getKey(String configKey) {
        return configService.selectConfigByKey(configKey);
    }
}
