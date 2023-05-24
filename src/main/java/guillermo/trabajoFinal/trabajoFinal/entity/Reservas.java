package guillermo.trabajoFinal.trabajoFinal.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Reservas")
public class Reservas {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuarios usuario;
	@ManyToOne
	@JoinColumn(name="idAnuncio")
	private Anuncios anuncio;
	private Date fecha_checkin;
	private Date fecha_chekout;
	private String estado;
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
	public Date getFecha_checkin() {
		return fecha_checkin;
	}
	public void setFecha_checkin(Date fecha_checkin) {
		this.fecha_checkin = fecha_checkin;
	}
	public Date getFecha_chekout() {
		return fecha_chekout;
	}
	public void setFecha_chekout(Date fecha_chekout) {
		this.fecha_chekout = fecha_chekout;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Reservas [id=" + id + ", usuario=" + usuario + ", anuncio=" + anuncio + ", fecha_checkin="
				+ fecha_checkin + ", fecha_chekout=" + fecha_chekout + ", estado=" + estado + "]";
	}
	
	
	
}
