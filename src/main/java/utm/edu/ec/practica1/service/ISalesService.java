package utm.edu.ec.practica1.service;
import utm.edu.ec.practica1.entity.Sales;

import java.util.Date;
import java.util.List;

public interface ISalesService {
    void saveSales(Sales sales);
    List<Sales> findSalesByFecha(Date fecha);
}
