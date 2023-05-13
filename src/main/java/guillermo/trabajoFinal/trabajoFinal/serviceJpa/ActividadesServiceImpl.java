package guillermo.trabajoFinal.trabajoFinal.serviceJpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import guillermo.trabajoFinal.trabajoFinal.entity.Actividades;
import guillermo.trabajoFinal.trabajoFinal.repository.ActividadesRepository;
import guillermo.trabajoFinal.trabajoFinal.service.IActividadesService;

public class ActividadesServiceImpl implements IActividadesService{
	
	@Autowired
	private ActividadesRepository actividadesRepository;
	
	@Override
	public Actividades guardarActvidades(Actividades actividades) {
		actividadesRepository.save(actividades);
		return null;
	}

	@Override
	public Actividades buscarPorId(Integer idActividades) {
		return actividadesRepository.findById(idActividades).orElse(null);
	}

	@Override
	public void eliminar(Integer idActividades) {
		actividadesRepository.deleteById(idActividades);
	}

	@Override
	public List<Actividades> findAll() {
		return actividadesRepository.findAll();
	}

}
