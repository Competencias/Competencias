package modelo;

// Generated 11/01/2012 03:50:04 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NotaEntregaId generated by hbm2java
 */
@Embeddable
public class NotaEntregaId implements java.io.Serializable {

	private int codigoNotaEntrega;
	private String origen;

	public NotaEntregaId() {
	}

	public NotaEntregaId(int codigoNotaEntrega, String origen) {
		this.codigoNotaEntrega = codigoNotaEntrega;
		this.origen = origen;
	}

	@Column(name = "codigo_nota_entrega", nullable = false)
	public int getCodigoNotaEntrega() {
		return this.codigoNotaEntrega;
	}

	public void setCodigoNotaEntrega(int codigoNotaEntrega) {
		this.codigoNotaEntrega = codigoNotaEntrega;
	}

	@Column(name = "origen", nullable = false)
	public String getOrigen() {
		return this.origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NotaEntregaId))
			return false;
		NotaEntregaId castOther = (NotaEntregaId) other;

		return (this.getCodigoNotaEntrega() == castOther.getCodigoNotaEntrega())
				&& ((this.getOrigen() == castOther.getOrigen()) || (this
						.getOrigen() != null && castOther.getOrigen() != null && this
						.getOrigen().equals(castOther.getOrigen())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoNotaEntrega();
		result = 37 * result
				+ (getOrigen() == null ? 0 : this.getOrigen().hashCode());
		return result;
	}

}
