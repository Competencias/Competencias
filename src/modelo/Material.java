package modelo;

// Generated 11/01/2012 03:50:04 PM by Hibernate Tools 3.4.0.CR1

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
 * Material generated by hbm2java
 */
@Entity
@Table(name = "material", schema = "public")
public class Material implements java.io.Serializable {

	private int codigoMaterial;
	private DatoBasico datoBasicoByCodigoTipoMaterial;
	private Almacen almacen;
	private DatoBasico datoBasicoByCodigoUnidadMedida;
	private String descripcion;
	private int cantidadExistencia;
	private Integer cantidadPresentacion;
	private int cantidadDisponible;
	private boolean reutilizable;
	private Integer stockMinimo;
	private Integer stockMaximo;
	private char estatus;
	private Set<MaterialActividad> materialActividads = new HashSet<MaterialActividad>(
			0);
	private Set<DocumentoAcreedorMaterial> documentoAcreedorMaterials = new HashSet<DocumentoAcreedorMaterial>(
			0);
	private Set<RecepcionMaterial> recepcionMaterials = new HashSet<RecepcionMaterial>(
			0);
	private Set<MaterialActividadPlanificada> materialActividadPlanificadas = new HashSet<MaterialActividadPlanificada>(
			0);
	private Set<CuentaPagarMaterial> cuentaPagarMaterials = new HashSet<CuentaPagarMaterial>(
			0);
	private Set<DetalleRequisicion> detalleRequisicions = new HashSet<DetalleRequisicion>(
			0);
	private Set<CuentaPagarMaterial> cuentaPagarMaterials_1 = new HashSet<CuentaPagarMaterial>(
			0);

	public Material() {
	}

	public Material(int codigoMaterial,
			DatoBasico datoBasicoByCodigoTipoMaterial, Almacen almacen,
			String descripcion, int cantidadExistencia, int cantidadDisponible,
			boolean reutilizable, char estatus) {
		this.codigoMaterial = codigoMaterial;
		this.datoBasicoByCodigoTipoMaterial = datoBasicoByCodigoTipoMaterial;
		this.almacen = almacen;
		this.descripcion = descripcion;
		this.cantidadExistencia = cantidadExistencia;
		this.cantidadDisponible = cantidadDisponible;
		this.reutilizable = reutilizable;
		this.estatus = estatus;
	}

	public Material(int codigoMaterial,
			DatoBasico datoBasicoByCodigoTipoMaterial, Almacen almacen,
			DatoBasico datoBasicoByCodigoUnidadMedida, String descripcion,
			int cantidadExistencia, Integer cantidadPresentacion,
			int cantidadDisponible, boolean reutilizable, Integer stockMinimo,
			Integer stockMaximo, char estatus,
			Set<MaterialActividad> materialActividads,
			Set<DocumentoAcreedorMaterial> documentoAcreedorMaterials,
			Set<RecepcionMaterial> recepcionMaterials,
			Set<MaterialActividadPlanificada> materialActividadPlanificadas,
			Set<CuentaPagarMaterial> cuentaPagarMaterials,
			Set<DetalleRequisicion> detalleRequisicions,
			Set<CuentaPagarMaterial> cuentaPagarMaterials_1) {
		this.codigoMaterial = codigoMaterial;
		this.datoBasicoByCodigoTipoMaterial = datoBasicoByCodigoTipoMaterial;
		this.almacen = almacen;
		this.datoBasicoByCodigoUnidadMedida = datoBasicoByCodigoUnidadMedida;
		this.descripcion = descripcion;
		this.cantidadExistencia = cantidadExistencia;
		this.cantidadPresentacion = cantidadPresentacion;
		this.cantidadDisponible = cantidadDisponible;
		this.reutilizable = reutilizable;
		this.stockMinimo = stockMinimo;
		this.stockMaximo = stockMaximo;
		this.estatus = estatus;
		this.materialActividads = materialActividads;
		this.documentoAcreedorMaterials = documentoAcreedorMaterials;
		this.recepcionMaterials = recepcionMaterials;
		this.materialActividadPlanificadas = materialActividadPlanificadas;
		this.cuentaPagarMaterials = cuentaPagarMaterials;
		this.detalleRequisicions = detalleRequisicions;
		this.cuentaPagarMaterials_1 = cuentaPagarMaterials_1;
	}

	@Id
	@Column(name = "codigo_material", unique = true, nullable = false)
	public int getCodigoMaterial() {
		return this.codigoMaterial;
	}

	public void setCodigoMaterial(int codigoMaterial) {
		this.codigoMaterial = codigoMaterial;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tipo_material", nullable = false)
	public DatoBasico getDatoBasicoByCodigoTipoMaterial() {
		return this.datoBasicoByCodigoTipoMaterial;
	}

	public void setDatoBasicoByCodigoTipoMaterial(
			DatoBasico datoBasicoByCodigoTipoMaterial) {
		this.datoBasicoByCodigoTipoMaterial = datoBasicoByCodigoTipoMaterial;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_almacen", nullable = false)
	public Almacen getAlmacen() {
		return this.almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_unidad_medida")
	public DatoBasico getDatoBasicoByCodigoUnidadMedida() {
		return this.datoBasicoByCodigoUnidadMedida;
	}

	public void setDatoBasicoByCodigoUnidadMedida(
			DatoBasico datoBasicoByCodigoUnidadMedida) {
		this.datoBasicoByCodigoUnidadMedida = datoBasicoByCodigoUnidadMedida;
	}

	@Column(name = "descripcion", nullable = false)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "cantidad_existencia", nullable = false)
	public int getCantidadExistencia() {
		return this.cantidadExistencia;
	}

	public void setCantidadExistencia(int cantidadExistencia) {
		this.cantidadExistencia = cantidadExistencia;
	}

	@Column(name = "cantidad_presentacion")
	public Integer getCantidadPresentacion() {
		return this.cantidadPresentacion;
	}

	public void setCantidadPresentacion(Integer cantidadPresentacion) {
		this.cantidadPresentacion = cantidadPresentacion;
	}

	@Column(name = "cantidad_disponible", nullable = false)
	public int getCantidadDisponible() {
		return this.cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}

	@Column(name = "reutilizable", nullable = false)
	public boolean isReutilizable() {
		return this.reutilizable;
	}

	public void setReutilizable(boolean reutilizable) {
		this.reutilizable = reutilizable;
	}

	@Column(name = "stock_minimo")
	public Integer getStockMinimo() {
		return this.stockMinimo;
	}

	public void setStockMinimo(Integer stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	@Column(name = "stock_maximo")
	public Integer getStockMaximo() {
		return this.stockMaximo;
	}

	public void setStockMaximo(Integer stockMaximo) {
		this.stockMaximo = stockMaximo;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "material")
	public Set<MaterialActividad> getMaterialActividads() {
		return this.materialActividads;
	}

	public void setMaterialActividads(Set<MaterialActividad> materialActividads) {
		this.materialActividads = materialActividads;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "material")
	public Set<DocumentoAcreedorMaterial> getDocumentoAcreedorMaterials() {
		return this.documentoAcreedorMaterials;
	}

	public void setDocumentoAcreedorMaterials(
			Set<DocumentoAcreedorMaterial> documentoAcreedorMaterials) {
		this.documentoAcreedorMaterials = documentoAcreedorMaterials;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "material")
	public Set<RecepcionMaterial> getRecepcionMaterials() {
		return this.recepcionMaterials;
	}

	public void setRecepcionMaterials(Set<RecepcionMaterial> recepcionMaterials) {
		this.recepcionMaterials = recepcionMaterials;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "material")
	public Set<MaterialActividadPlanificada> getMaterialActividadPlanificadas() {
		return this.materialActividadPlanificadas;
	}

	public void setMaterialActividadPlanificadas(
			Set<MaterialActividadPlanificada> materialActividadPlanificadas) {
		this.materialActividadPlanificadas = materialActividadPlanificadas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "material")
	public Set<CuentaPagarMaterial> getCuentaPagarMaterials() {
		return this.cuentaPagarMaterials;
	}

	public void setCuentaPagarMaterials(
			Set<CuentaPagarMaterial> cuentaPagarMaterials) {
		this.cuentaPagarMaterials = cuentaPagarMaterials;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "material")
	public Set<DetalleRequisicion> getDetalleRequisicions() {
		return this.detalleRequisicions;
	}

	public void setDetalleRequisicions(
			Set<DetalleRequisicion> detalleRequisicions) {
		this.detalleRequisicions = detalleRequisicions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "material")
	public Set<CuentaPagarMaterial> getCuentaPagarMaterials_1() {
		return this.cuentaPagarMaterials_1;
	}

	public void setCuentaPagarMaterials_1(
			Set<CuentaPagarMaterial> cuentaPagarMaterials_1) {
		this.cuentaPagarMaterials_1 = cuentaPagarMaterials_1;
	}

}
