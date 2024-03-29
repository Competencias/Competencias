package modelo;

// Generated 11/01/2012 03:50:04 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DatoSocial generated by hbm2java
 */
@Entity
@Table(name = "dato_social", schema = "public")
public class DatoSocial implements java.io.Serializable {

	private int codigoDatoSocial;
	private DatoBasico datoBasico;
	private Institucion institucion;
	private Jugador jugador;
	private Integer horasDedicadas;
	private Date fechaInicio;
	private char estatus;

	public DatoSocial() {
	}

	public DatoSocial(int codigoDatoSocial, DatoBasico datoBasico,
			Institucion institucion, Jugador jugador, char estatus) {
		this.codigoDatoSocial = codigoDatoSocial;
		this.datoBasico = datoBasico;
		this.institucion = institucion;
		this.jugador = jugador;
		this.estatus = estatus;
	}

	public DatoSocial(int codigoDatoSocial, DatoBasico datoBasico,
			Institucion institucion, Jugador jugador, Integer horasDedicadas,
			Date fechaInicio, char estatus) {
		this.codigoDatoSocial = codigoDatoSocial;
		this.datoBasico = datoBasico;
		this.institucion = institucion;
		this.jugador = jugador;
		this.horasDedicadas = horasDedicadas;
		this.fechaInicio = fechaInicio;
		this.estatus = estatus;
	}

	@Id
	@Column(name = "codigo_dato_social", unique = true, nullable = false)
	public int getCodigoDatoSocial() {
		return this.codigoDatoSocial;
	}

	public void setCodigoDatoSocial(int codigoDatoSocial) {
		this.codigoDatoSocial = codigoDatoSocial;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_actividad_social", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_institucion", nullable = false)
	public Institucion getInstitucion() {
		return this.institucion;
	}

	public void setInstitucion(Institucion institucion) {
		this.institucion = institucion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cedula_rif", nullable = false)
	public Jugador getJugador() {
		return this.jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	@Column(name = "horas_dedicadas")
	public Integer getHorasDedicadas() {
		return this.horasDedicadas;
	}

	public void setHorasDedicadas(Integer horasDedicadas) {
		this.horasDedicadas = horasDedicadas;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_inicio", length = 13)
	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
