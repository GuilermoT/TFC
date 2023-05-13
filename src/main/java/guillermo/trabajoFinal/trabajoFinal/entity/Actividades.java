package guillermo.trabajoFinal.trabajoFinal.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	private List<Anuncios> anuncios;
	
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
		return anuncios;
	}
	public void setAnuncios(List<Anuncios> anuncios) {
		this.anuncios = anuncios;
	}
	@Override
	public String toString() {
		return "Actividades [id=" + id + ", nombre=" + nombre + ", anuncios=" + anuncios + "]";
	}
	
	
	
	
}
