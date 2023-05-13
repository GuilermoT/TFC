package guillermo.trabajoFinal.trabajoFinal.service;

import java.util.List;

import guillermo.trabajoFinal.trabajoFinal.entity.Actividades;


public interface IActividadesService {
	Actividades guardarActvidades(Actividades actividades);
    Actividades buscarPorId(Integer idActividades);
	void eliminar(Integer idActividades);
	List<Actividades> findAll();
}
