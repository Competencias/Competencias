package modelo;

// Generated 11/01/2012 03:50:04 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TestJugador generated by hbm2java
 */
@Entity
@Table(name = "test_jugador", schema = "public")
public class TestJugador implements java.io.Serializable {

	private int codigoTestJugador;
	private Roster roster;
	private RosterPlan rosterPlan;
	private IndicadorTest indicadorTest;
	private String puntuacion;
	private char estatus;

	public TestJugador() {
	}

	public TestJugador(int codigoTestJugador, IndicadorTest indicadorTest,
			String puntuacion, char estatus) {
		this.codigoTestJugador = codigoTestJugador;
		this.indicadorTest = indicadorTest;
		this.puntuacion = puntuacion;
		this.estatus = estatus;
	}

	public TestJugador(int codigoTestJugador, Roster roster,
			RosterPlan rosterPlan, IndicadorTest indicadorTest,
			String puntuacion, char estatus) {
		this.codigoTestJugador = codigoTestJugador;
		this.roster = roster;
		this.rosterPlan = rosterPlan;
		this.indicadorTest = indicadorTest;
		this.puntuacion = puntuacion;
		this.estatus = estatus;
	}

	@Id
	@Column(name = "codigo_test_jugador", unique = true, nullable = false)
	public int getCodigoTestJugador() {
		return this.codigoTestJugador;
	}

	public void setCodigoTestJugador(int codigoTestJugador) {
		this.codigoTestJugador = codigoTestJugador;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_roster")
	public Roster getRoster() {
		return this.roster;
	}

	public void setRoster(Roster roster) {
		this.roster = roster;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_roster_plan")
	public RosterPlan getRosterPlan() {
		return this.rosterPlan;
	}

	public void setRosterPlan(RosterPlan rosterPlan) {
		this.rosterPlan = rosterPlan;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_indicador_test", nullable = false)
	public IndicadorTest getIndicadorTest() {
		return this.indicadorTest;
	}

	public void setIndicadorTest(IndicadorTest indicadorTest) {
		this.indicadorTest = indicadorTest;
	}

	@Column(name = "puntuacion", nullable = false)
	public String getPuntuacion() {
		return this.puntuacion;
	}

	public void setPuntuacion(String puntuacion) {
		this.puntuacion = puntuacion;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
