package guillermo.trabajoFinal.trabajoFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import guillermo.trabajoFinal.trabajoFinal.entity.Usuarios;
import guillermo.trabajoFinal.trabajoFinal.service.IUsuariosService;

public class UsuariosController {
	

	@Autowired
	private IUsuariosService usuarioService;
		
	@GetMapping("/usuarios")
	public String mostrarUsuarios(Model model) {
		List<Usuarios> lista= usuarioService.findAll();
		model.addAttribute("usuarios", lista);
		return "listaUsuario/listaUsuario.html";
	}
	
	@GetMapping("/deleteuser/{id}")
	public String eliminarUsuarios(@PathVariable("id") Integer idUsuario) {
		usuarioService.eliminar(idUsuario);
		return "redirect:/usuarios";
	}
		
}

