package guillermo.trabajoFinal.trabajoFinal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Favoritos")
public class Favoritos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuarios usuario;
	
	@ManyToOne
	@JoinColumn(name="idAnuncio")
	private Anuncios anuncio;

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

	public Anuncios getAnuncio() {
		return anuncio;
	}

	public void setAnuncio(Anuncios anuncio) {
		this.anuncio = anuncio;
	}

	@Override
	public String toString() {
		return "Favoritos [id=" + id + ", usuario=" + usuario + ", anuncio=" + anuncio + "]";
	}
	
	
	
}
