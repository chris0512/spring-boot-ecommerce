package com.chris.ecommerce.dao;

import com.chris.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
