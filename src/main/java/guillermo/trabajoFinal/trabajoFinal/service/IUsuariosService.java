package guillermo.trabajoFinal.trabajoFinal.service;

import java.util.List;


import guillermo.trabajoFinal.trabajoFinal.entity.Usuarios;


public interface IUsuariosService {
	void eliminar(Integer idUsuarios);
	List<Usuarios> findAll();
}
