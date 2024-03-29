package modelo;

// Generated 11/01/2012 03:50:04 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * RepresentanteJugadorPlan generated by hbm2java
 */
@Entity
@Table(name = "representante_jugador_plan", schema = "public")
public class RepresentanteJugadorPlan implements java.io.Serializable {

	private RepresentanteJugadorPlanId id;
	private JugadorPlan jugadorPlan;
	private RepresentantePlan representantePlan;
	private char estatus;

	public RepresentanteJugadorPlan() {
	}

	public RepresentanteJugadorPlan(RepresentanteJugadorPlanId id,
			JugadorPlan jugadorPlan, RepresentantePlan representantePlan,
			char estatus) {
		this.id = id;
		this.jugadorPlan = jugadorPlan;
		this.representantePlan = representantePlan;
		this.estatus = estatus;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "cedulaRif", column = @Column(name = "cedula_rif", nullable = false)),
			@AttributeOverride(name = "cedulaFamiliar", column = @Column(name = "cedula_familiar", nullable = false)) })
	public RepresentanteJugadorPlanId getId() {
		return this.id;
	}

	public void setId(RepresentanteJugadorPlanId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cedula_rif", nullable = false, insertable = false, updatable = false)
	public JugadorPlan getJugadorPlan() {
		return this.jugadorPlan;
	}

	public void setJugadorPlan(JugadorPlan jugadorPlan) {
		this.jugadorPlan = jugadorPlan;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cedula_familiar", nullable = false, insertable = false, updatable = false)
	public RepresentantePlan getRepresentantePlan() {
		return this.representantePlan;
	}

	public void setRepresentantePlan(RepresentantePlan representantePlan) {
		this.representantePlan = representantePlan;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
