package com.obl.wehelp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.ZoneId;
import java.util.TimeZone;

@SpringBootApplication
public class WeHelpApplication {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("Universal"));
        SpringApplication.run(WeHelpApplication.class, args);
    }

}
