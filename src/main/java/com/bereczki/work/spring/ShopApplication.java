package com.bereczki.work.spring;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Properties;

@SpringBootApplication
@EnableJpaAuditing
public class ShopApplication {

    @Bean
    public VelocityEngine createVelocityEngine() {
        Properties props = new Properties();
        props.put("resource.loader", "class");
        props.put("class.resource.loader.class",
                "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");

        VelocityEngine engine = new VelocityEngine();
        engine.init(props);

        return engine;
    }

    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
    }
}
