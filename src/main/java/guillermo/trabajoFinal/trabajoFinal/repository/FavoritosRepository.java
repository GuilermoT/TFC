package guillermo.trabajoFinal.trabajoFinal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import guillermo.trabajoFinal.trabajoFinal.entity.Favoritos;


public interface FavoritosRepository extends JpaRepository<Favoritos, Integer>{
	@Query("select f from Favoritos f where f.usuario.id = :idUsuarios")  
	List<Favoritos> findByUsuario(@Param("idUsuarios") Integer idUsuarios);
}
