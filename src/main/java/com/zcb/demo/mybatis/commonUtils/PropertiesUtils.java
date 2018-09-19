package com.zcb.demo.mybatis.commonUtils;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by zhuocongbin
 * date 2018/9/19
 */
@Slf4j
public class PropertiesUtils {
    private PropertiesUtils(){}
    private static class PropertiesInit{
        private static Properties properties;
        static {
            InputStream inputStream = PropertiesUtils.class.getClassLoader().getResourceAsStream("application.properties");
            try {
                properties = new Properties();
                properties.load(inputStream);
            } catch (IOException e) {
                log.error("load application properties error");
                System.exit(0);
            }
        }
    }
    public static Properties getProperties() {
        return PropertiesInit.properties;
    }
}
