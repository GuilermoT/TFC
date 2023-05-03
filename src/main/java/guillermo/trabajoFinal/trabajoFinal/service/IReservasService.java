package guillermo.trabajoFinal.trabajoFinal.service;

import java.util.List;

import org.springframework.data.domain.Example;

import guillermo.trabajoFinal.trabajoFinal.entity.Reservas;


public interface IReservasService {
	void eliminar(Integer idReservas);
	List<Reservas> findByExample(Example<Reservas> ejemplo);
	List<Reservas> findAll();
}
