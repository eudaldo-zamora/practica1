package utm.edu.ec.practica1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.edu.ec.practica1.entity.Provider;
import utm.edu.ec.practica1.service.IProviderService;

import java.util.List;

@RestController
@RequestMapping(path="/provider")
public class ProviderController {

	@Autowired
	private IProviderService providerService;

	@PostMapping()
	public void saveProvider(@RequestBody Provider provider) {
		providerService.saveCustomer(provider);
	}

	@GetMapping()
	public List<Provider> findProviderByValue(@RequestParam String ruc) {
		return providerService.findProviderByValue(ruc);
	}

	@DeleteMapping()
	public void deleteProvider(@RequestParam String ruc){
		providerService.deleteProvider(ruc);

	}



}
