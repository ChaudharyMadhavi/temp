package com.example.ecom_project.Controller;


import com.example.ecom_project.Model.Product;
import com.example.ecom_project.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;



    @GetMapping("/products")
    public List<Product> getallproducts(){

        List<Product> products= service.getallproducts();
        return products;
    }

    @GetMapping("/product/{id}")
    public Product getproduct(@PathVariable int id){
        return service.getproduct(id);
    }


}
