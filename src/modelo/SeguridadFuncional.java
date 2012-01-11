package modelo;

// Generated 10/01/2012 04:06:24 PM by Hibernate Tools 3.4.0.CR1

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
 * SeguridadFuncional generated by hbm2java
 */
@Entity
@Table(name = "seguridad_funcional", schema = "public")
public class SeguridadFuncional implements java.io.Serializable {

	private int codigoSeguridad;
	private DatoBasico datoBasico;
	private TipoDato tipoDato;
	private Usuario usuario;
	private Date fechaRegistro;
	private Date horaRegistro;
	private int codigoRegistro;

	public SeguridadFuncional() {
	}

	public SeguridadFuncional(int codigoSeguridad, DatoBasico datoBasico,
			TipoDato tipoDato, Usuario usuario, Date fechaRegistro,
			Date horaRegistro, int codigoRegistro) {
		this.codigoSeguridad = codigoSeguridad;
		this.datoBasico = datoBasico;
		this.tipoDato = tipoDato;
		this.usuario = usuario;
		this.fechaRegistro = fechaRegistro;
		this.horaRegistro = horaRegistro;
		this.codigoRegistro = codigoRegistro;
	}

	@Id
	@Column(name = "codigo_seguridad", unique = true, nullable = false)
	public int getCodigoSeguridad() {
		return this.codigoSeguridad;
	}

	public void setCodigoSeguridad(int codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_dato_basico", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tipo_dato", nullable = false)
	public TipoDato getTipoDato() {
		return this.tipoDato;
	}

	public void setTipoDato(TipoDato tipoDato) {
		this.tipoDato = tipoDato;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cedula_rif", nullable = false)
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_registro", nullable = false, length = 13)
	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "hora_registro", nullable = false, length = 13)
	public Date getHoraRegistro() {
		return this.horaRegistro;
	}

	public void setHoraRegistro(Date horaRegistro) {
		this.horaRegistro = horaRegistro;
	}

	@Column(name = "codigo_registro", nullable = false)
	public int getCodigoRegistro() {
		return this.codigoRegistro;
	}

	public void setCodigoRegistro(int codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}

}
