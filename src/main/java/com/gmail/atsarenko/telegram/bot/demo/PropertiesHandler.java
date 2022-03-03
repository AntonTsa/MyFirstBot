package com.gmail.atsarenko.telegram.bot.demo;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHandler {
    private Properties properties;
    public PropertiesHandler() {
        try {
            FileReader reader = new FileReader("src/main/resources/application.properties");
            properties = new Properties();
            properties.load(reader);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return properties.getProperty("bot.username");
    }

    public String getBotToken() {
        return properties.getProperty("bot.token");
    }
}
