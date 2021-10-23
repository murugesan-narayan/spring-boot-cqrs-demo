package com.muru.cqrs.demo.command.api.events;

import com.muru.cqrs.demo.command.api.model.Product;
import com.muru.cqrs.demo.command.api.repository.ProductRepository;
import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.messaging.interceptors.ExceptionHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
@ProcessingGroup("product")
public class ProductEventHandler {
    private final ProductRepository productRepository;
    public ProductEventHandler(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @EventHandler
    public void on(ProductCreatedEvent productCreatedEvent) {
        Product product = new Product();
        BeanUtils.copyProperties(productCreatedEvent, product);
        productRepository.save(product);
        //to test some exceptions
        //throw new RuntimeException("Test exception thrown from Product Event handler");
    }

    @ExceptionHandler
    public void handle(Exception exception) throws Exception {
        throw exception;
    }
}
