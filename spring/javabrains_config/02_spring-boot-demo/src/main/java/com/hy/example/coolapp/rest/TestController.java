package com.hy.example.coolapp.rest;

import com.hy.example.coolapp.DbSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RefreshScope
public class TestController {

    @Value("${my.greetings}")
    private String message;

    @Autowired
    private DbSettings dbSettings;

    @Autowired
    private Environment env;

    @GetMapping("/")
    public String sayHello(){
        return "Hello, the time is "+ LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run 5k tomorrow";
    }

    @GetMapping("/hello")
    public String greet(){
        return message;
    }

    @GetMapping("/db/settings")
    public String getDbSettings(){
        return dbSettings.getConnection() + " _ " + dbSettings.getHost() + " _ " + dbSettings.getPort();
    }

    @GetMapping("/envDetails")
    public String getEnv(){
        return env.toString();
    }

}
