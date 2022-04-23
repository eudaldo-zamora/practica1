package utm.edu.ec.practica1.repository;

import utm.edu.ec.practica1.entity.Product;
import java.util.List;

public interface CustomProductRepository {
    List<Product> findProductByValue(Double value);
}
