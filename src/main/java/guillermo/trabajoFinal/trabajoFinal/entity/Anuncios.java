package guillermo.trabajoFinal.trabajoFinal.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Anuncios")
public class Anuncios {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuarios usuario;
	
	private String titulo;
	private String descripcion;
	private Date fecha_publicacion;
	private String ubicacion;
	private Double precio;
	private String imagen;
	
	@ManyToMany(fetch=FetchType.EAGER) 
	@JoinTable(name="anunciosactividades",
			joinColumns = @JoinColumn(name="idAnuncios"),
			inverseJoinColumns = @JoinColumn(name="idActividades"))
	private List<Actividades> actividades;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha_publicacion() {
		return fecha_publicacion;
	}

	public void setFecha_publicacion(Date fecha_publicacion) {
		this.fecha_publicacion = fecha_publicacion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public List<Actividades> getActividades() {
		return actividades;
	}

	public void setActividades(List<Actividades> actividades) {
		this.actividades = actividades;
	}

	@Override
	public String toString() {
		return "Anuncios [id=" + id + ", usuario=" + usuario + ", titulo=" + titulo + ", descripcion=" + descripcion
				+ ", fecha_publicacion=" + fecha_publicacion + ", ubicacion=" + ubicacion + ", precio=" + precio
				+ ", imagen=" + imagen + ", actividades=" + actividades + "]";
	}
	
	
	
	
}
	