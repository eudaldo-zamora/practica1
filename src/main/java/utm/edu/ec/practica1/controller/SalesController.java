package utm.edu.ec.practica1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.edu.ec.practica1.entity.Product;
import utm.edu.ec.practica1.entity.Sales;
import utm.edu.ec.practica1.service.IProductService;

import java.util.List;

@RestController
@RequestMapping(path="/sales")
public class SalesController {
        @Autowired
        private ISalesService salesService;

        @PostMapping()
        public void saveSales(@RequestBody Sales sales) {
            salesService.saveCustomer(product);
        }

        @GetMapping()
        public List<Product> findProductByValue(@RequestParam Double value) {
            return productService.findProductByValue(value);
        }




    }
