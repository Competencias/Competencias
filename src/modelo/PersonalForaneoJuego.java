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
 * PersonalForaneoJuego generated by hbm2java
 */
@Entity
@Table(name = "personal_foraneo_juego", schema = "public")
public class PersonalForaneoJuego implements java.io.Serializable {

	private PersonalForaneoJuegoId id;
	private DatoBasico datoBasico;
	private Juego juego;
	private PersonalForaneo personalForaneo;

	public PersonalForaneoJuego() {
	}

	public PersonalForaneoJuego(PersonalForaneoJuegoId id, Juego juego,
			PersonalForaneo personalForaneo) {
		this.id = id;
		this.juego = juego;
		this.personalForaneo = personalForaneo;
	}

	public PersonalForaneoJuego(PersonalForaneoJuegoId id,
			DatoBasico datoBasico, Juego juego, PersonalForaneo personalForaneo) {
		this.id = id;
		this.datoBasico = datoBasico;
		this.juego = juego;
		this.personalForaneo = personalForaneo;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoJuego", column = @Column(name = "codigo_juego", nullable = false)),
			@AttributeOverride(name = "codigoPersonalForaneo", column = @Column(name = "codigo_personal_foraneo", nullable = false)) })
	public PersonalForaneoJuegoId getId() {
		return this.id;
	}

	public void setId(PersonalForaneoJuegoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tipo")
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_juego", nullable = false, insertable = false, updatable = false)
	public Juego getJuego() {
		return this.juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_personal_foraneo", nullable = false, insertable = false, updatable = false)
	public PersonalForaneo getPersonalForaneo() {
		return this.personalForaneo;
	}

	public void setPersonalForaneo(PersonalForaneo personalForaneo) {
		this.personalForaneo = personalForaneo;
	}

}
