package com.project.shopapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {
    @GetMapping("")
    public ResponseEntity<String> getProducts(
            @RequestParam("page") int page,
            @RequestParam("limit") int limit
    ) {
        return ResponseEntity.ok("get ok");
    }

    @GetMapping("{id}")
    public ResponseEntity<String> getProductById(
            @PathVariable("id") String productId
    ) {
        return ResponseEntity.ok("Product ID: " + productId);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body("Product deleted successfully");
    }
}
