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
import javax.persistence.Table;


@Entity
@Table(name="Usuarios")
public class Usuarios {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String email;
	private String username;
	private String password;
	private Integer estatus;
	private Date fechaRegistro;
	@ManyToMany(fetch=FetchType.EAGER) //eager es para tenerlo ya cargado desde el principio
	@JoinTable(name="usuarioperfil",
			joinColumns = @JoinColumn(name="idUsuario"),
			inverseJoinColumns = @JoinColumn(name="idPerfil"))
	private List<Perfiles> perfiles;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getEstatus() {
		return estatus;
	}
	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public List<Perfiles> getPerfiles() {
		return perfiles;
	}
	public void setPerfiles(List<Perfiles> perfiles) {
		this.perfiles = perfiles;
	}
	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nombre=" + nombre + ", email=" + email + ", username=" + username
				+ ", password=" + password + ", estatus=" + estatus + ", fechaRegistro=" + fechaRegistro + ", perfiles="
				+ perfiles + "]";
	}
	
	
	
	
}
