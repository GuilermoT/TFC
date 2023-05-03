package guillermo.trabajoFinal.trabajoFinal.service;

import java.util.List;

import org.springframework.data.domain.Example;

import guillermo.trabajoFinal.trabajoFinal.entity.Comentarios;


public interface IComentariosService {
	Picks buscarPorId(int idPicks);
	List<Comentarios> findByAnuncios(int idUsuario);
	void eliminar(Integer idComentarios);
	List<Comentarios> findByExample(Example<Comentarios> ejemplo);
	List<Comentarios> findAll();
}
