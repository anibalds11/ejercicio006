package es.cic.bootcamp.coche;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CocheController {
	
	@Autowired
	private CocheService cocheService;
	
	@GetMapping("/entrada")
	public String darEntrada() {
		return cocheService.darEntrada();
	}
	
	@GetMapping("/salida")
	public String darSalida() {
		return cocheService.darSalida();
	}

	public CocheService getCocheService() {
		return cocheService;
	}

	public void setCocheService(CocheService cocheService) {
		this.cocheService = cocheService;
	}
	
	
}
