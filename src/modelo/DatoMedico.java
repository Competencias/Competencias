package modelo;

// Generated 11/01/2012 03:50:04 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DatoMedico generated by hbm2java
 */
@Entity
@Table(name = "dato_medico", schema = "public")
public class DatoMedico implements java.io.Serializable {

	private int codigoDatoMedico;
	private Medico medico;
	private Jugador jugador;
	private Date fechaInforme;
	private Date fechaReincorporacion;
	private String observacion;
	private char estatus;
	private Set<AfeccionJugador> afeccionJugadors = new HashSet<AfeccionJugador>(
			0);
	private Set<DocumentoMedico> documentoMedicos = new HashSet<DocumentoMedico>(
			0);

	public DatoMedico() {
	}

	public DatoMedico(int codigoDatoMedico, Medico medico, Jugador jugador,
			char estatus) {
		this.codigoDatoMedico = codigoDatoMedico;
		this.medico = medico;
		this.jugador = jugador;
		this.estatus = estatus;
	}

	public DatoMedico(int codigoDatoMedico, Medico medico, Jugador jugador,
			Date fechaInforme, Date fechaReincorporacion, String observacion,
			char estatus, Set<AfeccionJugador> afeccionJugadors,
			Set<DocumentoMedico> documentoMedicos) {
		this.codigoDatoMedico = codigoDatoMedico;
		this.medico = medico;
		this.jugador = jugador;
		this.fechaInforme = fechaInforme;
		this.fechaReincorporacion = fechaReincorporacion;
		this.observacion = observacion;
		this.estatus = estatus;
		this.afeccionJugadors = afeccionJugadors;
		this.documentoMedicos = documentoMedicos;
	}

	@Id
	@Column(name = "codigo_dato_medico", unique = true, nullable = false)
	public int getCodigoDatoMedico() {
		return this.codigoDatoMedico;
	}

	public void setCodigoDatoMedico(int codigoDatoMedico) {
		this.codigoDatoMedico = codigoDatoMedico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "numero_colegio", nullable = false)
	public Medico getMedico() {
		return this.medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cedula_rif", nullable = false)
	public Jugador getJugador() {
		return this.jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_informe", length = 13)
	public Date getFechaInforme() {
		return this.fechaInforme;
	}

	public void setFechaInforme(Date fechaInforme) {
		this.fechaInforme = fechaInforme;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_reincorporacion", length = 13)
	public Date getFechaReincorporacion() {
		return this.fechaReincorporacion;
	}

	public void setFechaReincorporacion(Date fechaReincorporacion) {
		this.fechaReincorporacion = fechaReincorporacion;
	}

	@Column(name = "observacion")
	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "datoMedico")
	public Set<AfeccionJugador> getAfeccionJugadors() {
		return this.afeccionJugadors;
	}

	public void setAfeccionJugadors(Set<AfeccionJugador> afeccionJugadors) {
		this.afeccionJugadors = afeccionJugadors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "datoMedico")
	public Set<DocumentoMedico> getDocumentoMedicos() {
		return this.documentoMedicos;
	}

	public void setDocumentoMedicos(Set<DocumentoMedico> documentoMedicos) {
		this.documentoMedicos = documentoMedicos;
	}

}
