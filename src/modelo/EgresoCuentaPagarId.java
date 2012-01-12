package modelo;

// Generated 11/01/2012 03:50:04 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EgresoCuentaPagarId generated by hbm2java
 */
@Embeddable
public class EgresoCuentaPagarId implements java.io.Serializable {

	private String origen;
	private int codigoEgreso;

	public EgresoCuentaPagarId() {
	}

	public EgresoCuentaPagarId(String origen, int codigoEgreso) {
		this.origen = origen;
		this.codigoEgreso = codigoEgreso;
	}

	@Column(name = "origen", nullable = false)
	public String getOrigen() {
		return this.origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Column(name = "codigo_egreso", nullable = false)
	public int getCodigoEgreso() {
		return this.codigoEgreso;
	}

	public void setCodigoEgreso(int codigoEgreso) {
		this.codigoEgreso = codigoEgreso;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EgresoCuentaPagarId))
			return false;
		EgresoCuentaPagarId castOther = (EgresoCuentaPagarId) other;

		return ((this.getOrigen() == castOther.getOrigen()) || (this
				.getOrigen() != null && castOther.getOrigen() != null && this
				.getOrigen().equals(castOther.getOrigen())))
				&& (this.getCodigoEgreso() == castOther.getCodigoEgreso());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getOrigen() == null ? 0 : this.getOrigen().hashCode());
		result = 37 * result + this.getCodigoEgreso();
		return result;
	}

}
