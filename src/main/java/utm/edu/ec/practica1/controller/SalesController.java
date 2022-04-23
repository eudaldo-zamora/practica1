package utm.edu.ec.practica1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.edu.ec.practica1.entity.Ventas;
import utm.edu.ec.practica1.service.ISalesService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path="/sales")

public class SalesController {

    @Autowired
    private ISalesService salesService;


    @PostMapping()
    public void saveSales(@RequestBody Ventas sales) {
        salesService.saveSales(sales);
    }



}
