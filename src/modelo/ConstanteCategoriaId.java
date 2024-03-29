package modelo;

// Generated 31/12/2011 11:02:01 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ConstanteCategoriaId generated by hbm2java
 */
@Embeddable
public class ConstanteCategoriaId implements java.io.Serializable {

	private int codigoConstanteCategoria;
	private int codigoConstante;

	public ConstanteCategoriaId() {
	}

	public ConstanteCategoriaId(int codigoConstanteCategoria,
			int codigoConstante) {
		this.codigoConstanteCategoria = codigoConstanteCategoria;
		this.codigoConstante = codigoConstante;
	}

	@Column(name = "codigo_constante_categoria", nullable = false)
	public int getCodigoConstanteCategoria() {
		return this.codigoConstanteCategoria;
	}

	public void setCodigoConstanteCategoria(int codigoConstanteCategoria) {
		this.codigoConstanteCategoria = codigoConstanteCategoria;
	}

	@Column(name = "codigo_constante", nullable = false)
	public int getCodigoConstante() {
		return this.codigoConstante;
	}

	public void setCodigoConstante(int codigoConstante) {
		this.codigoConstante = codigoConstante;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ConstanteCategoriaId))
			return false;
		ConstanteCategoriaId castOther = (ConstanteCategoriaId) other;

		return (this.getCodigoConstanteCategoria() == castOther
				.getCodigoConstanteCategoria())
				&& (this.getCodigoConstante() == castOther.getCodigoConstante());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoConstanteCategoria();
		result = 37 * result + this.getCodigoConstante();
		return result;
	}

}
