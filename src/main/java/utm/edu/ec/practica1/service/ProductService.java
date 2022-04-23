package utm.edu.ec.practica1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utm.edu.ec.practica1.entity.Product;
import utm.edu.ec.practica1.repository.IProductRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductService implements IProductService {

    @Autowired
    IProductRepository productRepository;

    @Override
    public void saveCustomer(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> findProductByValue(Double value) {
        return productRepository.findProductByValue(value);
    }
}
