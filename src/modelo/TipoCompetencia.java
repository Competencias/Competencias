package modelo;

// Generated 10/01/2012 04:06:24 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TipoCompetencia generated by hbm2java
 */
@Entity
@Table(name = "tipo_competencia", schema = "public")
public class TipoCompetencia implements java.io.Serializable {

	private int codigoTipoCompetencia;
	private String nombre;
	private String descripcion;
	private char estatus;
	private Set<CondicionCompetencia> condicionCompetencias = new HashSet<CondicionCompetencia>(
			0);
	private Set<ModalidadCompetencia> modalidadCompetencias = new HashSet<ModalidadCompetencia>(
			0);

	public TipoCompetencia() {
	}

	public TipoCompetencia(int codigoTipoCompetencia, String nombre,
			char estatus) {
		this.codigoTipoCompetencia = codigoTipoCompetencia;
		this.nombre = nombre;
		this.estatus = estatus;
	}

	public TipoCompetencia(int codigoTipoCompetencia, String nombre,
			String descripcion, char estatus,
			Set<CondicionCompetencia> condicionCompetencias,
			Set<ModalidadCompetencia> modalidadCompetencias) {
		this.codigoTipoCompetencia = codigoTipoCompetencia;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estatus = estatus;
		this.condicionCompetencias = condicionCompetencias;
		this.modalidadCompetencias = modalidadCompetencias;
	}

	@Id
	@Column(name = "codigo_tipo_competencia", unique = true, nullable = false)
	public int getCodigoTipoCompetencia() {
		return this.codigoTipoCompetencia;
	}

	public void setCodigoTipoCompetencia(int codigoTipoCompetencia) {
		this.codigoTipoCompetencia = codigoTipoCompetencia;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "descripcion")
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoCompetencia")
	public Set<CondicionCompetencia> getCondicionCompetencias() {
		return this.condicionCompetencias;
	}

	public void setCondicionCompetencias(
			Set<CondicionCompetencia> condicionCompetencias) {
		this.condicionCompetencias = condicionCompetencias;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoCompetencia")
	public Set<ModalidadCompetencia> getModalidadCompetencias() {
		return this.modalidadCompetencias;
	}

	public void setModalidadCompetencias(
			Set<ModalidadCompetencia> modalidadCompetencias) {
		this.modalidadCompetencias = modalidadCompetencias;
	}

}
