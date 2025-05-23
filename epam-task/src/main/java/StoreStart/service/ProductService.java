package StoreStart.service;

import StoreStart.entity.Product;
import StoreStart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface  ProductService {
    List<Product> findAll();
    void save(Product product);
}
