package com.example.homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.nio.file.Path;
import java.nio.file.Paths;


//@RestController
@SpringBootApplication
public class HomeworkApplication {

    public static Path applicationRoot = getRootPath();
    public static String mainResourcePath = applicationRoot + "\\src\\main\\java\\com\\example\\homework\\config\\";

    public static void main(String[] args) {
        SpringApplication.run(HomeworkApplication.class, args);
    }
    private static Path getRootPath() {return Paths.get(".").normalize().toAbsolutePath(); }
}
