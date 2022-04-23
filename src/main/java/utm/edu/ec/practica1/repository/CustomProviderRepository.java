package utm.edu.ec.practica1.repository;

import utm.edu.ec.practica1.entity.Provider;
import java.util.List;

public interface CustomProviderRepository {
	List<Provider> findProviderByValue(String ruc);
}

