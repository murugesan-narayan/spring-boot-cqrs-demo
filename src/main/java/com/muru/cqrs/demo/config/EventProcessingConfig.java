package com.muru.cqrs.demo.config;

import com.muru.cqrs.demo.command.api.exception.ProductEventsExceptionHandler;
import org.axonframework.config.EventProcessingConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventProcessingConfig {
    @Autowired
    public void configure(EventProcessingConfigurer configurer) {
        configurer.registerListenerInvocationErrorHandler("product", configuration ->
                new ProductEventsExceptionHandler());
    }
}
