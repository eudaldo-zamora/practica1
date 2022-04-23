package utm.edu.ec.practica1.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import utm.edu.ec.practica1.entity.Customer;
import utm.edu.ec.practica1.entity.Product;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProductRepositoryTest {

    @Autowired
    IProductRepository productRepository;

    @Test
    public void shouldGetProductsByValue() {
        Product productToSave = new Product();
        productToSave.setName("product 1");
        productToSave.setDescription(" ");
        productToSave.setValue(25.15);
        //Product product = Product.builder().name("product 1").value(25.15).build();

        productRepository.save(productToSave);


        List<Product> listProduct = productRepository.findProductByValue(25.15);
        Assertions.assertFalse(listProduct.isEmpty(), "should return some elements");

        List<Product> listProduct2 = productRepository.findProductByValue(15.15);
        Assertions.assertTrue(listProduct2.isEmpty(), "should return empty list");
    }
}
