package com.detroitlabs.giflibrary;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@EnableAutoConfiguration
@ComponentScan

public class AppConfiguration {
    public static void main(String[] args) {

        SpringApplication.run(AppConfiguration.class, args);
    }//end main
}//end AppConfiguration
