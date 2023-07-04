package com.example.springProfileDemo.repo;

import com.example.springProfileDemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
