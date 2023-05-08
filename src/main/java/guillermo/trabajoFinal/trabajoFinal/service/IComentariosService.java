package guillermo.trabajoFinal.trabajoFinal.service;

import java.util.List;

import guillermo.trabajoFinal.trabajoFinal.entity.Comentarios;


public interface IComentariosService {
	void guardarComentarios(Comentarios comentarios);
    Comentarios buscarPorId(Integer idComentarios);
	List<Comentarios> findByAnuncios(int idAnuncios);
	void eliminar(Integer idComentarios);
	List<Comentarios> findAll();
	Comentarios actualizarComentario(Comentarios comentario);
}
