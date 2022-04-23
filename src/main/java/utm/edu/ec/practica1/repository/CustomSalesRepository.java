package utm.edu.ec.practica1.repository;

import utm.edu.ec.practica1.entity.Sales;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public interface CustomSalesRepository {
    List<Sales> findSalesByFecha(Date fecha);
}
