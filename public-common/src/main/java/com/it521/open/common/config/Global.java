package com.it521.open.common.config;

import com.it521.open.common.utils.StringUtils;
import com.it521.open.common.utils.YamlUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author X
 * @描述.全局配置类
 */
public class Global {
    private static final Logger log = LoggerFactory.getLogger(Global.class);

    private static String NAME = "application.yml";

    /**
     * @描述.当前对象实例
     */
    private static Global global;

    /**
     * @描述.保存全局属性值
     */
    private static Map<String, String> map = new HashMap();

    private Global() {
    }

    /**
     * @描述.静态工厂方法
     */
    public static synchronized Global getInstance() {
        if (global == null) {
            global = new Global();
        }
        return global;
    }

    /**
     * @描述.获取配置
     */
    public static String getConfig(String key) {
        String value = map.get(key);
        if (value == null) {
            Map<?, ?> yamlMap;
            try {
                yamlMap = YamlUtil.loadYaml(NAME);
                value = String.valueOf(YamlUtil.getProperty(yamlMap, key));
                map.put(key, value != null ? value : StringUtils.EMPTY);
            } catch (FileNotFoundException e) {
                log.error("获取全局配置异常 {}", key);
            }
        }
        return value;
    }

    /**
     * @描述.获取项目名称
     */
    public static String getName() {
        return StringUtils.nvl(getConfig("joine.name"), "Joine");
    }

    /**
     * @描述.获取项目版本
     */
    public static String getVersion() {
        return StringUtils.nvl(getConfig("joine.version"), "1.1.0");
    }

    /**
     * @描述.获取版权年份
     */
    public static String getCopyrightYear() {
        return StringUtils.nvl(getConfig("joine.copyrightYear"), "2019");
    }

    /**
     * @描述.获取ip地址开关
     */
    public static Boolean isAddressEnabled() {
        return Boolean.valueOf(getConfig("joine.addressEnabled"));
    }

    /**
     * @描述.获取文件上传路径
     */
    public static String getProfile() {
        return getConfig("joine.profile");
    }

    /**
     * @描述.获取头像上传路径
     */
    public static String getAvatarPath() {
        return getConfig("joine.profile") + "avatar/";
    }

    /**
     * @描述.获取下载路径
     */
    public static String getDownloadPath() {
        return getConfig("joine.profile") + "download/";
    }

    /**
     * @描述.获取上传路径
     */
    public static String getUploadPath() {
        return getConfig("joine.profile") + "upload/";
    }
}
