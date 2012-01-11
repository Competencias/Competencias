package modelo;

// Generated 10/01/2012 04:06:24 PM by Hibernate Tools 3.4.0.CR1

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
 * DatoAcademico generated by hbm2java
 */
@Entity
@Table(name = "dato_academico", schema = "public")
public class DatoAcademico implements java.io.Serializable {

	private int codigoAcademico;
	private DatoBasico datoBasicoByCodigoCurso;
	private Institucion institucion;
	private DatoBasico datoBasicoByCodigoAnnoEscolar;
	private Jugador jugador;
	private Date fechaIngreso;
	private char estatus;
	private Set<DocumentoAcademico> documentoAcademicos = new HashSet<DocumentoAcademico>(
			0);

	public DatoAcademico() {
	}

	public DatoAcademico(int codigoAcademico,
			DatoBasico datoBasicoByCodigoCurso, Institucion institucion,
			DatoBasico datoBasicoByCodigoAnnoEscolar, Jugador jugador,
			Date fechaIngreso, char estatus) {
		this.codigoAcademico = codigoAcademico;
		this.datoBasicoByCodigoCurso = datoBasicoByCodigoCurso;
		this.institucion = institucion;
		this.datoBasicoByCodigoAnnoEscolar = datoBasicoByCodigoAnnoEscolar;
		this.jugador = jugador;
		this.fechaIngreso = fechaIngreso;
		this.estatus = estatus;
	}

	public DatoAcademico(int codigoAcademico,
			DatoBasico datoBasicoByCodigoCurso, Institucion institucion,
			DatoBasico datoBasicoByCodigoAnnoEscolar, Jugador jugador,
			Date fechaIngreso, char estatus,
			Set<DocumentoAcademico> documentoAcademicos) {
		this.codigoAcademico = codigoAcademico;
		this.datoBasicoByCodigoCurso = datoBasicoByCodigoCurso;
		this.institucion = institucion;
		this.datoBasicoByCodigoAnnoEscolar = datoBasicoByCodigoAnnoEscolar;
		this.jugador = jugador;
		this.fechaIngreso = fechaIngreso;
		this.estatus = estatus;
		this.documentoAcademicos = documentoAcademicos;
	}

	@Id
	@Column(name = "codigo_academico", unique = true, nullable = false)
	public int getCodigoAcademico() {
		return this.codigoAcademico;
	}

	public void setCodigoAcademico(int codigoAcademico) {
		this.codigoAcademico = codigoAcademico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_curso", nullable = false)
	public DatoBasico getDatoBasicoByCodigoCurso() {
		return this.datoBasicoByCodigoCurso;
	}

	public void setDatoBasicoByCodigoCurso(DatoBasico datoBasicoByCodigoCurso) {
		this.datoBasicoByCodigoCurso = datoBasicoByCodigoCurso;
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
	@JoinColumn(name = "codigo_anno_escolar", nullable = false)
	public DatoBasico getDatoBasicoByCodigoAnnoEscolar() {
		return this.datoBasicoByCodigoAnnoEscolar;
	}

	public void setDatoBasicoByCodigoAnnoEscolar(
			DatoBasico datoBasicoByCodigoAnnoEscolar) {
		this.datoBasicoByCodigoAnnoEscolar = datoBasicoByCodigoAnnoEscolar;
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
	@Column(name = "fecha_ingreso", nullable = false, length = 13)
	public Date getFechaIngreso() {
		return this.fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "datoAcademico")
	public Set<DocumentoAcademico> getDocumentoAcademicos() {
		return this.documentoAcademicos;
	}

	public void setDocumentoAcademicos(
			Set<DocumentoAcademico> documentoAcademicos) {
		this.documentoAcademicos = documentoAcademicos;
	}

}
