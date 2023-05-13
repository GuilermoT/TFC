package guillermo.trabajoFinal.trabajoFinal.serviceJpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import guillermo.trabajoFinal.trabajoFinal.entity.Reservas;
import guillermo.trabajoFinal.trabajoFinal.repository.ReservasRepository;
import guillermo.trabajoFinal.trabajoFinal.service.IReservasService;

public class ReservasServiceImpl implements IReservasService{
	
	@Autowired
	private ReservasRepository reservasRepository;
	
	@Override
	public void eliminar(Integer idReservas) {
		reservasRepository.deleteById(idReservas);
		
	}

	@Override
	public List<Reservas> findAll() {
		return reservasRepository.findAll();
	}

}
