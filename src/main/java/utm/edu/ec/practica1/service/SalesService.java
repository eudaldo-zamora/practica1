package utm.edu.ec.practica1.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utm.edu.ec.practica1.entity.Ventas;
import utm.edu.ec.practica1.repository.ISalesRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional


public class SalesService implements ISalesService{

    @Autowired
    ISalesRepository salesRepository;


    @Override
    public void saveSales(Ventas sales) { salesRepository.save(sales);

    }

    @Override
    public List<Ventas> findCustomers() {

        return salesRepository.findAll();
    }
}
