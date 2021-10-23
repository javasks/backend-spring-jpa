package com.example.demo;


import com.example.demo.service.InitService;
import org.aspectj.lang.annotation.Before;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {


    private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
        LOGGER.info("I am in info mode");
        LOGGER.debug("I am in debug mode");
        LOGGER.error("Hey There is an error in this application");
        LOGGER.warn("THis is warnig for disk utilization");

    }

    @Bean
    CommandLineRunner init(InitService initService) {
        return args -> {
            initService.init();
        };
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}


