package abecedario.modelo.entidades;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Tienda {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTi;
	
	@NotNull
	@NotEmpty
	private String direccion;
	
	@NotNull
	@NotEmpty
	private String propietario;
	
	@OneToMany(fetch=FetchType.EAGER)
	private Set<Ejemplar> ejemplares;

	public Long getIdTi() {
		return idTi;
	}

	public void setIdTi(Long idTi) {
		this.idTi = idTi;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public Set<Ejemplar> getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(Set<Ejemplar> ejemplares) {
		this.ejemplares = ejemplares;
	}
	
	
	
}
