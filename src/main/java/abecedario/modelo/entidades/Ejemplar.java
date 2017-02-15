package abecedario.modelo.entidades;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Ejemplar {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEj;
	
	@NotNull
	@NotEmpty
	private Date fecha;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Libro libro;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Tienda tienda;

	public Long getIdEj() {
		return idEj;
	}

	public void setIdEj(Long idEj) {
		this.idEj = idEj;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}

}
