package utm.edu.ec.practica1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utm.edu.ec.practica1.entity.Sales;

import java.util.UUID;

public interface ISalesRepository extends JpaRepository<Sales, UUID> {}


