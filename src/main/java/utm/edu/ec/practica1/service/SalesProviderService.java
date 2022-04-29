package utm.edu.ec.practica1.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utm.edu.ec.practica1.entity.Ventas;
import utm.edu.ec.practica1.repository.ISalesProviderRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional


public class SalesProviderService implements ISalesProviderService {

    @Autowired
    ISalesProviderRepository salesRepository;


    @Override
    public void saveSales(Ventas sales) { salesRepository.save(sales);

    }

    @Override
    public List<Ventas> findCustomers() {

        return salesRepository.findAll();
    }
}
