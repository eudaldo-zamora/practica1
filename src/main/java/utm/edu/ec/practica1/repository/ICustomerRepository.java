package utm.edu.ec.practica1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utm.edu.ec.practica1.entity.Customer;

import java.util.UUID;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, UUID> {}
