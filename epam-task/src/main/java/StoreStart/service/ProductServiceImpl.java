package StoreStart.service;

import StoreStart.entity.Product;
import StoreStart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll(); // ← вызов JPA метода
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }
}
