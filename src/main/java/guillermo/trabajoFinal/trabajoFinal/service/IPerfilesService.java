package guillermo.trabajoFinal.trabajoFinal.service;

import java.util.List;

import org.springframework.data.domain.Example;

import guillermo.trabajoFinal.trabajoFinal.entity.Perfiles;


public interface IPerfilesService {
	void eliminar(Integer idPerfiles);
	List<Perfiles> findByExample(Example<Perfiles> ejemplo);
	List<Perfiles> findAll();
}
