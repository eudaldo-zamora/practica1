package utm.edu.ec.practica1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.edu.ec.practica1.entity.Product;
import utm.edu.ec.practica1.service.IProductService;

import java.util.List;

@RestController
@RequestMapping(path="/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @PostMapping()
    public void saveProduct(@RequestBody Product product) {
        productService.saveCustomer(product);
    }

    @GetMapping()
    public List<Product> findProductByValue(@RequestParam Double value) {
        return productService.findProductByValue(value);
    }

}
