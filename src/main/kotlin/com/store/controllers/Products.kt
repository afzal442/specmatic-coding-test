package com.store.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductsController {

    @GetMapping("/products")
    fun getProducts(@RequestParam type: String?): List<Product> {
        val products = mutableListOf<Product>()
       
        if (type != null) {
            if (type == "gadget") {
                products.add(Product(1, "XYZ Phone", "gadget", 2))
            }
        } else {
            products.add(Product(1, "XYZ Phone", "gadget", 2))
        }

        return products
    }
}

data class Product(val id: Int, val name: String, val type: String, val inventory: Int)
