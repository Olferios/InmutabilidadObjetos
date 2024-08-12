package appdi.app_di.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import appdi.app_di.models.Product;
import appdi.app_di.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product findById(Long id) {
        return productRepository.findById(id);
    }

    // public List<Product> findAll() {
    //     return productRepository.findAll().stream().map(p -> {
    //         Double priceImp = p.getPrices() * 1.5d;
    //         Product newProduct = new Product(p.getId(), p.getName(), priceImp.longValue());
    //         return newProduct;
    //     }).collect(Collectors.toList());

    // }
    public List<Product> findAll(){
        return productRepository.findAll().stream().map(p ->{
        Double priceTax = p.getPrices()* 1.5d;
        // Product newProduct = new Product(p.getId(), p.getName(),    priceImp.longValue());
        Product newProduct = (Product) p.clone();
        // p.setPrice(priceImp.longValue());
        newProduct.setPrices(priceTax.longValue());
        return newProduct;
        }).collect(Collectors.toList());
        }
}
