package com.example.homework.config;

import com.example.homework.HomeworkApplication;
import com.google.gson.Gson;
import javafx.application.Application;

import java.lang.reflect.Field;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class ConfigFileReader {

    private final static String CONFIG_PATH = "Config.json";

    private ConfigFileReader() {
    }

    public static String getValueFromConfig(String fieldName) {
        String result = "";
        ConfigModel data;
        Object value;
        try {
            String absolutePath = Paths.get(HomeworkApplication.mainResourcePath + CONFIG_PATH).toAbsolutePath().toString();
            BufferedReader br = new BufferedReader(new FileReader(absolutePath));
            String line;
            while ((line = br.readLine()) != null) {
                result += line;
            }
            data = new Gson().fromJson(result, ConfigModel.class);
        } catch (IOException e) {
            return "";
        }

        try {
            Field field = data.getClass().getField(fieldName);
            result = field.get(data).toString();
        } catch (NoSuchFieldException e) {
        } catch (IllegalAccessException e) {
        }

        return result;
    }
}

