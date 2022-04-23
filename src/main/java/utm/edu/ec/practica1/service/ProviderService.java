package utm.edu.ec.practica1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utm.edu.ec.practica1.entity.Provider;
import utm.edu.ec.practica1.repository.IProviderRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProviderService implements IProviderService {
	@Autowired
	IProviderRepository providerRepository;

	@Override
	public void saveCustomer(Provider provider) {providerRepository.save(provider);}

	@Override
	public List<Provider> findProviderByValue(String ruc) {return providerRepository.findProviderByValue (ruc);}

	@Override
	public void deleteProvider(String ruc) {
		List<Provider> providers=providerRepository.findProviderByValue(ruc);
		providers.forEach(x->{
			providerRepository.deleteById(x.getId());
		});
	}



}
