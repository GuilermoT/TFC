package guillermo.trabajoFinal.trabajoFinal.serviceJpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import guillermo.trabajoFinal.trabajoFinal.entity.Perfiles;
import guillermo.trabajoFinal.trabajoFinal.repository.PerfilesRepository;
import guillermo.trabajoFinal.trabajoFinal.service.IPerfilesService;

public class PerfilesServiceImpl implements IPerfilesService{

	@Autowired
	private PerfilesRepository perfilesRepository;
	
	@Override
	public void eliminar(Integer idPerfiles) {
		perfilesRepository.deleteById(idPerfiles);
		
	}

	@Override
	public List<Perfiles> findAll() {
		return perfilesRepository.findAll();
	}

}
