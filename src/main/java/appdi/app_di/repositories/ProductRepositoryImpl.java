package appdi.app_di.repositories;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import appdi.app_di.models.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository{
    List<Product> products;

    public ProductRepositoryImpl(){
        this.products = Arrays.asList(
            new Product(1L,"Laptop",450L),
            new Product(2L,"SmartPhone",200L),
            new Product(3L,"tablet",120L),
            new Product(4L,"monitor",30L),
            new Product(5L,"Keyboard",50L),
            new Product(6L,"mouse",100L),
            new Product(7L,"printer",100L),
            new Product(8L,"external hd",100L),
            new Product(9L,"headphones",100L),
            new Product(10L,"Webcam",100L)
        );
        
    }

    @Override
    public Product findById(Long id) {
        return products.stream().filter(p->p.getId().equals(id)).findFirst().orElseThrow();
    }

    @Override
    public List<Product> findAll() {
        return products;
    }
    

}
