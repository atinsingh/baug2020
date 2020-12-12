package io.pragra.learning.framwork.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

//@Geet -->Add Logger this class to print
// debug/error and warning message
public class AppConfig {

    private static AppConfig instance;
    private Properties properties;

    private AppConfig() {
        Path path = Paths.get("src/test/resources/framework.properties");
        try {
            FileInputStream stream = new FileInputStream(path.toFile());
            properties = new Properties();
            properties.load(stream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Object  getProperties(String key) {
        if( instance == null) {
            instance = new AppConfig();
        }
        return instance.properties.getProperty(key);
    }
}
