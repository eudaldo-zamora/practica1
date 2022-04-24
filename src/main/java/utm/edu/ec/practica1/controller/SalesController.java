package utm.edu.ec.practica1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.edu.ec.practica1.entity.Sales;
import utm.edu.ec.practica1.entity.Ventas;
import utm.edu.ec.practica1.service.ISalesProviderService;
import utm.edu.ec.practica1.service.ISalesService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path="/sales")

public class SalesController {

    @Autowired
    private ISalesProviderService salesProviderService;

    @Autowired
    private ISalesService salesService;

    @PostMapping()
    public void saveSales(@RequestBody Ventas sales) {
        salesProviderService.saveSales(sales);
    }

    @PostMapping()
    public void saveSales(@RequestBody Sales sales) {
        salesService.saveSales(sales);
    }

    @GetMapping()
    public List<Sales> findSalesByFecha(@RequestParam Date fecha) {
        return salesService.findSalesByFecha(fecha);
    }


}
