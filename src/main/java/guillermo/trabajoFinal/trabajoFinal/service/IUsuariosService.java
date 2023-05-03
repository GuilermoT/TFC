package guillermo.trabajoFinal.trabajoFinal.service;

import java.util.List;

import org.springframework.data.domain.Example;

import guillermo.trabajoFinal.trabajoFinal.entity.Usuarios;


public interface IUsuariosService {
	void eliminar(Integer idUsuarios);
	List<Usuarios> findByExample(Example<Usuarios> ejemplo);
	List<Usuarios> findAll();
}
