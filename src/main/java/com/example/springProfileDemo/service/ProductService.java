package com.example.springProfileDemo.service;

import com.example.springProfileDemo.entity.Product;
import com.example.springProfileDemo.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo repo;

    public List<Product> allProducts(){
        return repo.findAll();
    }
}
