package modelo;

// Generated 11/01/2012 03:50:04 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Grupo generated by hbm2java
 */
@Entity
@Table(name = "grupo", schema = "public")
public class Grupo implements java.io.Serializable {

	private int codigoGrupo;
	private String nombre;
	private char estatus;
	private Set<PerfilGrupo> perfilGrupos = new HashSet<PerfilGrupo>(0);
	private Set<Funcionalidad> funcionalidads = new HashSet<Funcionalidad>(0);

	public Grupo() {
	}

	public Grupo(int codigoGrupo, String nombre, char estatus) {
		this.codigoGrupo = codigoGrupo;
		this.nombre = nombre;
		this.estatus = estatus;
	}

	public Grupo(int codigoGrupo, String nombre, char estatus,
			Set<PerfilGrupo> perfilGrupos, Set<Funcionalidad> funcionalidads) {
		this.codigoGrupo = codigoGrupo;
		this.nombre = nombre;
		this.estatus = estatus;
		this.perfilGrupos = perfilGrupos;
		this.funcionalidads = funcionalidads;
	}

	@Id
	@Column(name = "codigo_grupo", unique = true, nullable = false)
	public int getCodigoGrupo() {
		return this.codigoGrupo;
	}

	public void setCodigoGrupo(int codigoGrupo) {
		this.codigoGrupo = codigoGrupo;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "grupo")
	public Set<PerfilGrupo> getPerfilGrupos() {
		return this.perfilGrupos;
	}

	public void setPerfilGrupos(Set<PerfilGrupo> perfilGrupos) {
		this.perfilGrupos = perfilGrupos;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "grupos")
	public Set<Funcionalidad> getFuncionalidads() {
		return this.funcionalidads;
	}

	public void setFuncionalidads(Set<Funcionalidad> funcionalidads) {
		this.funcionalidads = funcionalidads;
	}

}
