package utm.edu.ec.practica1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utm.edu.ec.practica1.entity.Sales;
import utm.edu.ec.practica1.repository.IProductRepository;
import utm.edu.ec.practica1.repository.ISalesRepository;

import java.util.Date;
import java.util.List;
@Service
public class SalesService implements ISalesService{
    @Autowired
    ISalesRepository salesRepository;

    @Override
    public void saveSales(Sales sales) {
        salesRepository.save(sales);
    }

    @Override
    public List<Sales> findSalesByFecha(Date fecha) {

        return salesRepository.findSalesByFecha(fecha);
    }
}
