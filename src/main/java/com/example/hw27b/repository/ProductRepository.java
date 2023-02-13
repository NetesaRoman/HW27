package com.example.hw27b.repository;

import com.example.hw27b.model.Product;
import org.springframework.data.repository.CrudRepository;

/*
 *
 * @author Roman Netesa
 *
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
