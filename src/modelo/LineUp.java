package modelo;

// Generated 10/01/2012 04:06:24 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * LineUp generated by hbm2java
 */
@Entity
@Table(name = "line_up", schema = "public")
public class LineUp implements java.io.Serializable {

	private int codigoLineUp;
	private RosterCompetencia rosterCompetencia;
	private Juego juego;
	private DatoBasico datoBasicoByCodigoPosicion;
	private DatoBasico datoBasicoByCodigoTipoMencion;
	private Set<DesempennoIndividual> desempennoIndividuals = new HashSet<DesempennoIndividual>(
			0);

	public LineUp() {
	}

	public LineUp(int codigoLineUp, RosterCompetencia rosterCompetencia,
			Juego juego, DatoBasico datoBasicoByCodigoPosicion,
			DatoBasico datoBasicoByCodigoTipoMencion) {
		this.codigoLineUp = codigoLineUp;
		this.rosterCompetencia = rosterCompetencia;
		this.juego = juego;
		this.datoBasicoByCodigoPosicion = datoBasicoByCodigoPosicion;
		this.datoBasicoByCodigoTipoMencion = datoBasicoByCodigoTipoMencion;
	}

	public LineUp(int codigoLineUp, RosterCompetencia rosterCompetencia,
			Juego juego, DatoBasico datoBasicoByCodigoPosicion,
			DatoBasico datoBasicoByCodigoTipoMencion,
			Set<DesempennoIndividual> desempennoIndividuals) {
		this.codigoLineUp = codigoLineUp;
		this.rosterCompetencia = rosterCompetencia;
		this.juego = juego;
		this.datoBasicoByCodigoPosicion = datoBasicoByCodigoPosicion;
		this.datoBasicoByCodigoTipoMencion = datoBasicoByCodigoTipoMencion;
		this.desempennoIndividuals = desempennoIndividuals;
	}

	@Id
	@Column(name = "codigo_line_up", unique = true, nullable = false)
	public int getCodigoLineUp() {
		return this.codigoLineUp;
	}

	public void setCodigoLineUp(int codigoLineUp) {
		this.codigoLineUp = codigoLineUp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_roster_competencia", nullable = false)
	public RosterCompetencia getRosterCompetencia() {
		return this.rosterCompetencia;
	}

	public void setRosterCompetencia(RosterCompetencia rosterCompetencia) {
		this.rosterCompetencia = rosterCompetencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_juego", nullable = false)
	public Juego getJuego() {
		return this.juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_posicion", nullable = false)
	public DatoBasico getDatoBasicoByCodigoPosicion() {
		return this.datoBasicoByCodigoPosicion;
	}

	public void setDatoBasicoByCodigoPosicion(
			DatoBasico datoBasicoByCodigoPosicion) {
		this.datoBasicoByCodigoPosicion = datoBasicoByCodigoPosicion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tipo_mencion", nullable = false)
	public DatoBasico getDatoBasicoByCodigoTipoMencion() {
		return this.datoBasicoByCodigoTipoMencion;
	}

	public void setDatoBasicoByCodigoTipoMencion(
			DatoBasico datoBasicoByCodigoTipoMencion) {
		this.datoBasicoByCodigoTipoMencion = datoBasicoByCodigoTipoMencion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lineUp")
	public Set<DesempennoIndividual> getDesempennoIndividuals() {
		return this.desempennoIndividuals;
	}

	public void setDesempennoIndividuals(
			Set<DesempennoIndividual> desempennoIndividuals) {
		this.desempennoIndividuals = desempennoIndividuals;
	}

}
