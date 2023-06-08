package guillermo.trabajoFinal.trabajoFinal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String mostrarInicio() {
		return "inicio/index.html";
	}
	
}


