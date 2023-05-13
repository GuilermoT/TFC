package guillermo.trabajoFinal.trabajoFinal.serviceJpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import guillermo.trabajoFinal.trabajoFinal.entity.Usuarios;
import guillermo.trabajoFinal.trabajoFinal.repository.UsuariosRepository;
import guillermo.trabajoFinal.trabajoFinal.service.IUsuariosService;

public class UsuariosServiceImpl implements IUsuariosService{

	@Autowired
	private UsuariosRepository usuariosRepository;
	
	@Override
	public void eliminar(Integer idUsuarios) {
		usuariosRepository.deleteById(idUsuarios);
		
	}

	@Override
	public List<Usuarios> findAll() {
		return usuariosRepository.findAll();
	}
	
}
