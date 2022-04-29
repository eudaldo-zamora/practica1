package utm.edu.ec.practica1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.edu.ec.practica1.entity.Product;
import utm.edu.ec.practica1.entity.Sales;
import utm.edu.ec.practica1.service.IProductService;
import utm.edu.ec.practica1.service.ISalesService;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path="/sales")
public class SalesController {
        @Autowired
        private ISalesService salesService;

        @PostMapping()
        public void saveSales(@RequestBody Sales sales) {
            salesService.saveSales(sales);
        }

        @GetMapping()
        public List<Sales> findSalesByFecha(@RequestParam Date fecha) {
            return salesService.findSalesByFecha(fecha);
        }




    }
