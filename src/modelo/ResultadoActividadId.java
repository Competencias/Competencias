package modelo;

// Generated 11/01/2012 03:50:04 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ResultadoActividadId generated by hbm2java
 */
@Embeddable
public class ResultadoActividadId implements java.io.Serializable {

	private int codigoResultado;
	private int codigoActividad;

	public ResultadoActividadId() {
	}

	public ResultadoActividadId(int codigoResultado, int codigoActividad) {
		this.codigoResultado = codigoResultado;
		this.codigoActividad = codigoActividad;
	}

	@Column(name = "codigo_resultado", nullable = false)
	public int getCodigoResultado() {
		return this.codigoResultado;
	}

	public void setCodigoResultado(int codigoResultado) {
		this.codigoResultado = codigoResultado;
	}

	@Column(name = "codigo_actividad", nullable = false)
	public int getCodigoActividad() {
		return this.codigoActividad;
	}

	public void setCodigoActividad(int codigoActividad) {
		this.codigoActividad = codigoActividad;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ResultadoActividadId))
			return false;
		ResultadoActividadId castOther = (ResultadoActividadId) other;

		return (this.getCodigoResultado() == castOther.getCodigoResultado())
				&& (this.getCodigoActividad() == castOther.getCodigoActividad());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoResultado();
		result = 37 * result + this.getCodigoActividad();
		return result;
	}

}
