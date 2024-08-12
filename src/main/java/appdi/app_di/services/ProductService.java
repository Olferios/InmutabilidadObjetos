package appdi.app_di.services;

import java.util.List;

import appdi.app_di.models.Product;

public interface ProductService {
    List <Product> findAll();
    Product findById(Long id);

}
