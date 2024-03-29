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
 * DocumentoAscenso generated by hbm2java
 */
@Entity
@Table(name = "documento_ascenso", schema = "public")
public class DocumentoAscenso implements java.io.Serializable {

	private DocumentoAscensoId id;
	private DocumentoEntregado documentoEntregado;
	private Ascenso ascenso;
	private char estatus;

	public DocumentoAscenso() {
	}

	public DocumentoAscenso(DocumentoAscensoId id,
			DocumentoEntregado documentoEntregado, Ascenso ascenso, char estatus) {
		this.id = id;
		this.documentoEntregado = documentoEntregado;
		this.ascenso = ascenso;
		this.estatus = estatus;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoDocumentoEntregado", column = @Column(name = "codigo_documento_entregado", nullable = false)),
			@AttributeOverride(name = "codigoAscenso", column = @Column(name = "codigo_ascenso", nullable = false)) })
	public DocumentoAscensoId getId() {
		return this.id;
	}

	public void setId(DocumentoAscensoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_documento_entregado", nullable = false, insertable = false, updatable = false)
	public DocumentoEntregado getDocumentoEntregado() {
		return this.documentoEntregado;
	}

	public void setDocumentoEntregado(DocumentoEntregado documentoEntregado) {
		this.documentoEntregado = documentoEntregado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_ascenso", nullable = false, insertable = false, updatable = false)
	public Ascenso getAscenso() {
		return this.ascenso;
	}

	public void setAscenso(Ascenso ascenso) {
		this.ascenso = ascenso;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
