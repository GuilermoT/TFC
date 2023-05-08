package guillermo.trabajoFinal.trabajoFinal.service;

import java.util.List;


import guillermo.trabajoFinal.trabajoFinal.entity.Perfiles;


public interface IPerfilesService {
	void eliminar(Integer idPerfiles);
	List<Perfiles> findAll();
}
