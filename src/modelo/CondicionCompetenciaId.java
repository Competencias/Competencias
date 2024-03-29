package modelo;

// Generated 11/01/2012 03:50:04 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CondicionCompetenciaId generated by hbm2java
 */
@Embeddable
public class CondicionCompetenciaId implements java.io.Serializable {

	private int codigoCondicion;
	private int codigoTipoCompetencia;

	public CondicionCompetenciaId() {
	}

	public CondicionCompetenciaId(int codigoCondicion, int codigoTipoCompetencia) {
		this.codigoCondicion = codigoCondicion;
		this.codigoTipoCompetencia = codigoTipoCompetencia;
	}

	@Column(name = "codigo_condicion", nullable = false)
	public int getCodigoCondicion() {
		return this.codigoCondicion;
	}

	public void setCodigoCondicion(int codigoCondicion) {
		this.codigoCondicion = codigoCondicion;
	}

	@Column(name = "codigo_tipo_competencia", nullable = false)
	public int getCodigoTipoCompetencia() {
		return this.codigoTipoCompetencia;
	}

	public void setCodigoTipoCompetencia(int codigoTipoCompetencia) {
		this.codigoTipoCompetencia = codigoTipoCompetencia;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CondicionCompetenciaId))
			return false;
		CondicionCompetenciaId castOther = (CondicionCompetenciaId) other;

		return (this.getCodigoCondicion() == castOther.getCodigoCondicion())
				&& (this.getCodigoTipoCompetencia() == castOther
						.getCodigoTipoCompetencia());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoCondicion();
		result = 37 * result + this.getCodigoTipoCompetencia();
		return result;
	}

}
