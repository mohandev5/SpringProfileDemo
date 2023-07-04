package com.example.springProfileDemo.controller;

import com.example.springProfileDemo.entity.Product;
import com.example.springProfileDemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Profile({"dev","test","prod"})
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/productsList")
    public List<Product> getAll(){
        return service.allProducts();
    }

}
