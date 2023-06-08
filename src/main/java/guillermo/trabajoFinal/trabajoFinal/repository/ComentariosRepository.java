package guillermo.trabajoFinal.trabajoFinal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import guillermo.trabajoFinal.trabajoFinal.entity.Comentarios;


public interface ComentariosRepository extends JpaRepository<Comentarios, Integer>{
	@Query("select c from Comentarios c where c.anuncio.id = :idAnuncios")  
	List<Comentarios> findByAnuncio(@Param("idAnuncios") int id);   //lo cambie a Long
	
}
