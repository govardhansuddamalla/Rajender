package com.org.project.utills;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ConfigFile {

    public static String userName;
    public static String password;
    public static String hostName;
    public static String applicationUrl;
    public static String browserName;
    public static String projectDirectory = System.getProperty("user.dir");
    public static String headless;
    public static Map<String, String> propertiesAsMap = new HashMap<String, String>();

    public static void setupConfiguration() {
        loadEnvProperties();
        setCredintials();
        setApplicationurl();
        setBrowser();
    }

    public static void loadEnvProperties() {
        Properties readProperties = new Properties();
        try {
            readProperties.load(new FileInputStream(projectDirectory + "/src/test/resources/com.org/project/config/env.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        propertiesAsMap.putAll(convertPropertiesIntoMap(readProperties));
        propertiesAsMap.putAll(readSystemProperties());
    }

    public static Map<String, String> readSystemProperties() {
        Properties properties = System.getProperties();
        return convertPropertiesIntoMap(properties);
    }

    public static Map<String, String> convertPropertiesIntoMap(Properties properties) {
        Map<String, String> map = new HashMap<String, String>();
        for (String key : properties.stringPropertyNames()) {
            map.put(key, properties.getProperty(key));
        }
        return map;
    }

    public static void setCredintials() {
        userName = propertiesAsMap.get("admin_user");
        password = propertiesAsMap.get("admin_password");
    }

    public static void setApplicationurl() {
        hostName = propertiesAsMap.get("env");
        applicationUrl = String.format(propertiesAsMap.get("application_url"), hostName);
    }

    public static void setBrowser() {
        browserName = propertiesAsMap.get("browser");
        headless = propertiesAsMap.get("headless");
    }

}
