package utm.edu.ec.practica1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import utm.edu.ec.practica1.entity.Customer;
import utm.edu.ec.practica1.entity.Ventas;

import java.util.UUID;

public interface ISalesRepository extends JpaRepository<Ventas,UUID>  {}
