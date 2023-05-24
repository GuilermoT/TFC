package guillermo.trabajoFinal.trabajoFinal.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Actividades")
public class Actividades {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	@ManyToMany
	@JoinTable(name="anunciosactividades",
			joinColumns = @JoinColumn(name="idActividades"),
			inverseJoinColumns = @JoinColumn(name="idAnuncios"))
	private List<Anuncios> anuncio;//quite la s a segundo anuncios
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Anuncios> getAnuncios() {
		return anuncio;
	}
	public void setAnuncios(List<Anuncios> anuncio) {
		this.anuncio = anuncio;
	}
	@Override
	public String toString() {
		return "Actividades [id=" + id + ", nombre=" + nombre + ", anuncio=" + anuncio + "]";
	}
	
	
	
	
}
