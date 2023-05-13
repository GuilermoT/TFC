package guillermo.trabajoFinal.trabajoFinal.service;

import java.util.List;

import guillermo.trabajoFinal.trabajoFinal.entity.Actividades;
import guillermo.trabajoFinal.trabajoFinal.entity.Anuncios;


public interface IAnunciosService {
//crear actualizar ver eliminar guardar 
	//FALTA ACTUALIZAR ANUNCIO
	Anuncios guardarAnuncios(Anuncios anuncios);
    Anuncios buscarPorId(Integer idAnuncios);
	void eliminar(Integer idAnuncios);
	List<Anuncios> findAll();
	List<Anuncios> findByFilters(String lugar, List<Actividades> actividades);
}
