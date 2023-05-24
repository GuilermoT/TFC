package guillermo.trabajoFinal.trabajoFinal.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
	
	@GetMapping("/")
	public String mostrarInicio() {
		return "inicio/index.html";
	}
}
