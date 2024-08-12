package com.ruoyi.common.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("applicationContextUtil")
public class ApplicationContextUtil implements ApplicationContextAware {

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }


    public static <T> T getBean(Class<T> clazz) {
        if (null == context) {
            return null;
        }
        return context.getBean(clazz);
    }

    public static <T> T getBean(String beanName) {
        if (null == context) {
            return null;
        }
        return (T) context.getBean(beanName);
    }

    public static <T> T getBean(String beanName,Class<T>clazz) {
        if (null == context) {
            return null;
        }
        return context.getBean(beanName,clazz);
    }

}
