package utm.edu.ec.practica1.service;
import utm.edu.ec.practica1.entity.Ventas;

import java.util.List;


public interface ISalesService {

    void saveSales(Ventas sales);
    List<Ventas> findCustomers();
}
