package modelo;

// Generated 10/01/2012 04:06:24 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CuentaPagarMaterialId generated by hbm2java
 */
@Embeddable
public class CuentaPagarMaterialId implements java.io.Serializable {

	private int codigoMaterial;
	private String origen;

	public CuentaPagarMaterialId() {
	}

	public CuentaPagarMaterialId(int codigoMaterial, String origen) {
		this.codigoMaterial = codigoMaterial;
		this.origen = origen;
	}

	@Column(name = "codigo_material", nullable = false)
	public int getCodigoMaterial() {
		return this.codigoMaterial;
	}

	public void setCodigoMaterial(int codigoMaterial) {
		this.codigoMaterial = codigoMaterial;
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
		if (!(other instanceof CuentaPagarMaterialId))
			return false;
		CuentaPagarMaterialId castOther = (CuentaPagarMaterialId) other;

		return (this.getCodigoMaterial() == castOther.getCodigoMaterial())
				&& ((this.getOrigen() == castOther.getOrigen()) || (this
						.getOrigen() != null && castOther.getOrigen() != null && this
						.getOrigen().equals(castOther.getOrigen())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoMaterial();
		result = 37 * result
				+ (getOrigen() == null ? 0 : this.getOrigen().hashCode());
		return result;
	}

}
