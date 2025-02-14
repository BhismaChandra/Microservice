package com.bhisma.microservice.product.repository;

import com.bhisma.microservice.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}

