package guillermo.trabajoFinal.trabajoFinal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import guillermo.trabajoFinal.trabajoFinal.entity.Anuncios;


public interface AnunciosRepository extends JpaRepository<Anuncios, Integer>{
	List<Anuncios> findByUbicacion(String ubicacion);
}
