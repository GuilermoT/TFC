package guillermo.trabajoFinal.trabajoFinal.service;

import java.util.List;

import org.springframework.data.domain.Example;

import guillermo.trabajoFinal.trabajoFinal.entity.Favoritos;


public interface IFavoritosService {
	void eliminar(Integer idFavoritos);
	List<Favoritos> findByExample(Example<Favoritos> ejemplo);
	List<Favoritos> findAll();
}
