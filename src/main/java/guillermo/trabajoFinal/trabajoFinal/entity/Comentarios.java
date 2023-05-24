package guillermo.trabajoFinal.trabajoFinal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Comentarios")
public class Comentarios {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuarios usuario;
	
	@ManyToOne
	@JoinColumn(name="idAnuncio") //LA S ANUNCIOS y añadi get y set
	private Anuncios anuncio;
	
	private String comentario;
	private Integer calificacion;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Usuarios getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}
	public Anuncios getAnuncio() {
		return anuncio;
	}
	public void setAnuncio(Anuncios anuncio) {
		this.anuncio = anuncio;
	}
	public Integer getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
	}
	@Override
	public String toString() {
		return "Comentarios [id=" + id + ", usuario=" + usuario + ", anuncio=" + anuncio + ", comentario=" + comentario
				+ ", calificacion=" + calificacion + "]";
	}
	
	
	
}
