package appdi.app_di.repositories;

import java.util.List;

import appdi.app_di.models.Product;

public interface ProductRepository {
    Product findById(Long id);
    List <Product> findAll();

}
