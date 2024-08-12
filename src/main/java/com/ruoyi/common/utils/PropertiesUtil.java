package com.ruoyi.common.utils;

import org.springframework.context.annotation.DependsOn;
import org.springframework.core.env.Environment;

@DependsOn(value = "applicationContextUtil")
public class PropertiesUtil {

    public static String getProperty(String key, String defaultValue) {
        Environment environment = ApplicationContextUtil.getBean(Environment.class);
        if (environment == null) {
            return defaultValue;
        }
        return environment.getProperty(key, defaultValue);
    }

    public static String getProperty(String key) {
        Environment environment = ApplicationContextUtil.getBean(Environment.class);
        if (environment == null) {
            return null;
        }
        return environment.getProperty(key);
    }

    public static <T> T getProperty(String key, Class<T> clazz) {
        Environment environment = ApplicationContextUtil.getBean(Environment.class);
        if (environment==null){
            return null;
        }
        return environment.getProperty(key, clazz);
    }

    public static <T> T getProperty(String key, Class<T> clazz,T defaultValue) {
        Environment environment = ApplicationContextUtil.getBean(Environment.class);
        if (environment==null){
            return defaultValue;
        }
        return environment.getProperty(key, clazz,defaultValue);
    }


}
