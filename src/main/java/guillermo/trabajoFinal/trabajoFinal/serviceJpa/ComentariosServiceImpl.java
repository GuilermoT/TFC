package guillermo.trabajoFinal.trabajoFinal.serviceJpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import guillermo.trabajoFinal.trabajoFinal.entity.Comentarios;
import guillermo.trabajoFinal.trabajoFinal.repository.ComentariosRepository;
import guillermo.trabajoFinal.trabajoFinal.service.IComentariosService;

public class ComentariosServiceImpl implements IComentariosService{

	@Autowired
	private ComentariosRepository comentariosRepository;

	@Override
	public void guardarComentarios(Comentarios comentarios) {
		comentariosRepository.save(comentarios);
		
	}

	@Override
	public Comentarios buscarPorId(Integer idComentarios) {
		return comentariosRepository.findById(idComentarios).orElse(null);
	}

	@Override
	public List<Comentarios> findByAnuncios(int idAnuncios) {
		return comentariosRepository.findByAnuncio(idAnuncios);
	}

	@Override
	public void eliminar(Integer idComentarios) {
		comentariosRepository.deleteById(idComentarios);
		
	}

	@Override
	public List<Comentarios> findAll() {
		return comentariosRepository.findAll();
	}

	@Override
	public Comentarios actualizarComentario(Comentarios comentario) {
		Comentarios comentarios = comentariosRepository.findById(comentario.getId()).orElse(null);
		comentarios.setComentario(comentario.getComentario());
		//comentariosRepository.save(comentarios);
		return comentarios;
	}
	

	

}
