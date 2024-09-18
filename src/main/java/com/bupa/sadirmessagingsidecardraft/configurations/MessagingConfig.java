package com.bupa.sadirmessagingsidecardraft.configurations;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
@Slf4j
public class MessagingConfig {

    @Bean
    Consumer<String> notification(){
        return notification -> log.info("Incoming notification: {}", notification);
    }
}
