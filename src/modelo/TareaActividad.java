package modelo;

// Generated 11/01/2012 03:50:04 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TareaActividad generated by hbm2java
 */
@Entity
@Table(name = "tarea_actividad", schema = "public")
public class TareaActividad implements java.io.Serializable {

	private int codigoTareaActividad;
	private DatoBasico datoBasico;
	private Actividad actividad;
	private PersonalActividad personalActividad;
	private char estatus;

	public TareaActividad() {
	}

	public TareaActividad(int codigoTareaActividad, DatoBasico datoBasico,
			Actividad actividad, PersonalActividad personalActividad,
			char estatus) {
		this.codigoTareaActividad = codigoTareaActividad;
		this.datoBasico = datoBasico;
		this.actividad = actividad;
		this.personalActividad = personalActividad;
		this.estatus = estatus;
	}

	@Id
	@Column(name = "codigo_tarea_actividad", unique = true, nullable = false)
	public int getCodigoTareaActividad() {
		return this.codigoTareaActividad;
	}

	public void setCodigoTareaActividad(int codigoTareaActividad) {
		this.codigoTareaActividad = codigoTareaActividad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tarea", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_actividad", nullable = false)
	public Actividad getActividad() {
		return this.actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "cedula_rif", referencedColumnName = "cedula_rif", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "codigo_actividad", referencedColumnName = "codigo_actividad", nullable = false, insertable = false, updatable = false) })
	public PersonalActividad getPersonalActividad() {
		return this.personalActividad;
	}

	public void setPersonalActividad(PersonalActividad personalActividad) {
		this.personalActividad = personalActividad;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
