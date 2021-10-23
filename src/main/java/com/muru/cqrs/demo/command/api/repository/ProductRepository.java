package com.muru.cqrs.demo.command.api.repository;

import com.muru.cqrs.demo.command.api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
