package guillermo.trabajoFinal.trabajoFinal.service;

import java.util.List;

import org.springframework.data.domain.Example;

import guillermo.trabajoFinal.trabajoFinal.entity.Anuncios;

public interface IAnunciosService {
//crear actualizar ver eliminar
	void eliminar(Integer idAnuncios);
	List<Anuncios> findByExample(Example<Anuncios> ejemplo);
	List<Anuncios> findAll();
}
