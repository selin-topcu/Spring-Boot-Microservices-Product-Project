package com.selintopcu.microservices.product.repository;

import com.selintopcu.microservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRespository extends MongoRepository<Product, String> {
}
