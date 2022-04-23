package utm.edu.ec.practica1.service;

import utm.edu.ec.practica1.entity.Provider;

import java.util.List;

public interface IProviderService {
	void saveCustomer (Provider provider);
	List<Provider> findProviderByValue(String ruc);

	void deleteProvider (String ruc);

}
