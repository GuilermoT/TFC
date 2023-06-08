package guillermo.trabajoFinal.trabajoFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import guillermo.trabajoFinal.trabajoFinal.entity.Anuncios;
import guillermo.trabajoFinal.trabajoFinal.repository.AnunciosRepository;

@Controller
public class AnunciosController {
	private AnunciosRepository anunciosRepository;

    @Autowired
    public AnunciosController(AnunciosRepository anunciosRepository) {
        this.anunciosRepository = anunciosRepository;
    }

    @GetMapping("/anuncios")
    public String mostrarAnuncios(Model model) {
        List<Anuncios> listaAnuncios = anunciosRepository.findAll();

        model.addAttribute("anuncios", listaAnuncios);

        return "anuncios/anuncios.html";
    }
    
    
}
