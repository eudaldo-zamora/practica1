package utm.edu.ec.practica1.service;

import utm.edu.ec.practica1.entity.Product;

import java.util.List;

public interface IProductService {
    void saveCustomer(Product product);
    List<Product> findProductByValue(Double value);
}
