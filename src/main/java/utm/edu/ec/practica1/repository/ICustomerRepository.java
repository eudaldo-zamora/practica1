package utm.edu.ec.practica1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utm.edu.ec.practica1.entity.Customer;

import java.util.UUID;

public interface ICustomerRepository extends JpaRepository<Customer, UUID> {}
