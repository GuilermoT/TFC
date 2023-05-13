package guillermo.trabajoFinal.trabajoFinal.serviceJpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import guillermo.trabajoFinal.trabajoFinal.entity.Actividades;
import guillermo.trabajoFinal.trabajoFinal.entity.Anuncios;
import guillermo.trabajoFinal.trabajoFinal.repository.AnunciosRepository;
import guillermo.trabajoFinal.trabajoFinal.service.IAnunciosService;

public class AnunciosServiceImpl implements IAnunciosService{
	//FALTA ACTUALIZAR ANUNCIO
	@Autowired
	private AnunciosRepository anunciosRepository;
	
	@Override
	public Anuncios guardarAnuncios(Anuncios anuncios) {
		return anunciosRepository.save(anuncios);
	}

	@Override
	public Anuncios buscarPorId(Integer idAnuncios) {
		return anunciosRepository.findById(idAnuncios).orElse(null);
	}

	@Override
	public void eliminar(Integer idAnuncios) {
		anunciosRepository.deleteById(idAnuncios);
	}

	@Override
	public List<Anuncios> findAll() {
		return anunciosRepository.findAll();
	}

	@Override
	public List<Anuncios> findByFilters(String lugar, List<Actividades> actividades) {
		List<Anuncios> anuncios;
		if(lugar==null) {
			anuncios = anunciosRepository.findAll();
		}else {
			anuncios = anunciosRepository.findByUbicacion(lugar);
		}
		List<Anuncios> anunciosFiltrado = new ArrayList<>();
		for(Anuncios anuncio:anuncios) {
			if(anuncio.getActividades().containsAll(actividades)) {
				anunciosFiltrado.add(anuncio);
			}
		}
		return anunciosFiltrado;
	}
	
	
}
