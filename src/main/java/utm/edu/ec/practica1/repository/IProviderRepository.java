package utm.edu.ec.practica1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utm.edu.ec.practica1.entity.Provider;

import java.util.UUID;

public interface IProviderRepository extends JpaRepository<Provider, UUID>,CustomProviderRepository {}
