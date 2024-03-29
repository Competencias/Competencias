package modelo;

// Generated 31/12/2011 11:02:01 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * IngresoFormaPagoId generated by hbm2java
 */
@Embeddable
public class IngresoFormaPagoId implements java.io.Serializable {

	private String numeroDocumento;
	private int codigoFormaPago;

	public IngresoFormaPagoId() {
	}

	public IngresoFormaPagoId(String numeroDocumento, int codigoFormaPago) {
		this.numeroDocumento = numeroDocumento;
		this.codigoFormaPago = codigoFormaPago;
	}

	@Column(name = "numero_documento", nullable = false)
	public String getNumeroDocumento() {
		return this.numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	@Column(name = "codigo_forma_pago", nullable = false)
	public int getCodigoFormaPago() {
		return this.codigoFormaPago;
	}

	public void setCodigoFormaPago(int codigoFormaPago) {
		this.codigoFormaPago = codigoFormaPago;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof IngresoFormaPagoId))
			return false;
		IngresoFormaPagoId castOther = (IngresoFormaPagoId) other;

		return ((this.getNumeroDocumento() == castOther.getNumeroDocumento()) || (this
				.getNumeroDocumento() != null
				&& castOther.getNumeroDocumento() != null && this
				.getNumeroDocumento().equals(castOther.getNumeroDocumento())))
				&& (this.getCodigoFormaPago() == castOther.getCodigoFormaPago());
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getNumeroDocumento() == null ? 0 : this.getNumeroDocumento()
						.hashCode());
		result = 37 * result + this.getCodigoFormaPago();
		return result;
	}

}
