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
 * ConstanteCategoria generated by hbm2java
 */
@Entity
@Table(name = "constante_categoria", schema = "public")
public class ConstanteCategoria implements java.io.Serializable {

	private int codigoConstanteCategoria;
	private Constante constante;
	private Categoria categoria;
	private int valor;

	public ConstanteCategoria() {
	}

	public ConstanteCategoria(int codigoConstanteCategoria,
			Constante constante, Categoria categoria, int valor) {
		this.codigoConstanteCategoria = codigoConstanteCategoria;
		this.constante = constante;
		this.categoria = categoria;
		this.valor = valor;
	}

	@Id
	@Column(name = "codigo_constante_categoria", unique = true, nullable = false)
	public int getCodigoConstanteCategoria() {
		return this.codigoConstanteCategoria;
	}

	public void setCodigoConstanteCategoria(int codigoConstanteCategoria) {
		this.codigoConstanteCategoria = codigoConstanteCategoria;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_constante", nullable = false)
	public Constante getConstante() {
		return this.constante;
	}

	public void setConstante(Constante constante) {
		this.constante = constante;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_categoria_1", nullable = false)
	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Column(name = "valor", nullable = false)
	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}