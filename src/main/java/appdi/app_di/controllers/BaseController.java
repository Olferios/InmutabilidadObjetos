package appdi.app_di.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import appdi.app_di.models.Product;
import appdi.app_di.services.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class BaseController {

    @Autowired
    private ProductService serviceProduct;

    @GetMapping("/{id}")
    public Product show(@PathVariable Long id) {
        return serviceProduct.findById(id);
    }
    @GetMapping
    public List<Product>list(){
        return serviceProduct.findAll();
    
    }
    

}
