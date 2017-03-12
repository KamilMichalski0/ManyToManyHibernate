package michalski.kamil.service;

import michalski.kamil.entity.Product;
import michalski.kamil.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl {

    @Autowired
    ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        return productRepository.findOne(id);
    }

    public void saveClient(Product product) {
        productRepository.save(product);
    }

}
