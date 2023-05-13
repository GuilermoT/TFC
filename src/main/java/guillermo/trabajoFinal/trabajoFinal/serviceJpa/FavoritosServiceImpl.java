package guillermo.trabajoFinal.trabajoFinal.serviceJpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import guillermo.trabajoFinal.trabajoFinal.entity.Favoritos;
import guillermo.trabajoFinal.trabajoFinal.repository.FavoritosRepository;
import guillermo.trabajoFinal.trabajoFinal.service.IFavoritosService;

public class FavoritosServiceImpl implements IFavoritosService{

	@Autowired
	private FavoritosRepository favoritosRepository;
	
	@Override
	public void guardarFavoritos(Favoritos favoritos) {
		favoritosRepository.save(favoritos);
		
	}

	@Override
	public Favoritos buscarPorId(Integer idFavoritos) {
		return favoritosRepository.findById(idFavoritos).orElse(null);
	}

	@Override
	public List<Favoritos> findByUsuario(Integer idUsuarios) {
		return favoritosRepository.findByUsuario(idUsuarios);
	}

	@Override
	public void eliminar(Integer idFavoritos) {
		favoritosRepository.deleteById(idFavoritos);
		
	}

	@Override
	public List<Favoritos> findAll() {
		return favoritosRepository.findAll();
	}

}
