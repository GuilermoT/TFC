package guillermo.trabajoFinal.trabajoFinal.service;

import java.util.List;


import guillermo.trabajoFinal.trabajoFinal.entity.Reservas;


public interface IReservasService {
	void eliminar(Integer idReservas);
	List<Reservas> findAll();
}
