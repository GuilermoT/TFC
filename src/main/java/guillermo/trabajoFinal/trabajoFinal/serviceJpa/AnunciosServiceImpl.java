package guillermo.trabajoFinal.trabajoFinal.serviceJpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import guillermo.trabajoFinal.trabajoFinal.entity.Anuncios;
import guillermo.trabajoFinal.trabajoFinal.repository.AnunciosRepository;
import guillermo.trabajoFinal.trabajoFinal.service.IAnunciosService;

public class AnunciosServiceImpl implements IAnunciosService{
	
	@Autowired
	private AnunciosRepository anunciosRepository;
	
	@Override
	public void guardarAnuncios(Anuncios anuncios) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Anuncios buscarPorId(Integer idAnuncios) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer idAnuncios) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Anuncios> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
