package com.valueservice.dll;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableTransactionManagement
public class App extends SpringBootServletInitializer {

    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(App.class).run(args);
    }

    @PostConstruct
    public void initial(){

    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(App.class);
    }
}
