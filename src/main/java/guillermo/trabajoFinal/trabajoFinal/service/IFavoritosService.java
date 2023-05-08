package guillermo.trabajoFinal.trabajoFinal.service;

import java.util.List;

import guillermo.trabajoFinal.trabajoFinal.entity.Comentarios;
import guillermo.trabajoFinal.trabajoFinal.entity.Favoritos;


public interface IFavoritosService {
	void guardarFavoritos(Favoritos favoritos);
    Favoritos buscarPorId(Integer idFavoritos);
	List<Favoritos> findByUsuario(Integer idUsuarios);
	void eliminar(Integer idFavoritos);
	List<Favoritos> findAll();
}
