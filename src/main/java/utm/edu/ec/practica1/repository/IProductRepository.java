package utm.edu.ec.practica1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utm.edu.ec.practica1.entity.Product;

import java.util.UUID;

public interface IProductRepository extends JpaRepository<Product, UUID>, CustomProductRepository {}
