package modelo;

// Generated 11/01/2012 03:50:04 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Familiar generated by hbm2java
 */
@Entity
@Table(name = "familiar", schema = "public")
public class Familiar implements java.io.Serializable {

	private String cedulaRif;
	private DatoBasico datoBasico;
	private PersonaNatural personaNatural;
	private char estatus;
	private Set<FamiliarJugador> familiarJugadors = new HashSet<FamiliarJugador>(
			0);
	private RepresentantePlan representantePlan;

	public Familiar() {
	}

	public Familiar(PersonaNatural personaNatural, char estatus) {
		this.personaNatural = personaNatural;
		this.estatus = estatus;
	}

	public Familiar(DatoBasico datoBasico, PersonaNatural personaNatural,
			char estatus, Set<FamiliarJugador> familiarJugadors,
			RepresentantePlan representantePlan) {
		this.datoBasico = datoBasico;
		this.personaNatural = personaNatural;
		this.estatus = estatus;
		this.familiarJugadors = familiarJugadors;
		this.representantePlan = representantePlan;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "personaNatural"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "cedula_rif", unique = true, nullable = false)
	public String getCedulaRif() {
		return this.cedulaRif;
	}

	public void setCedulaRif(String cedulaRif) {
		this.cedulaRif = cedulaRif;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_profesion")
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public PersonaNatural getPersonaNatural() {
		return this.personaNatural;
	}

	public void setPersonaNatural(PersonaNatural personaNatural) {
		this.personaNatural = personaNatural;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "familiar")
	public Set<FamiliarJugador> getFamiliarJugadors() {
		return this.familiarJugadors;
	}

	public void setFamiliarJugadors(Set<FamiliarJugador> familiarJugadors) {
		this.familiarJugadors = familiarJugadors;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "familiar")
	public RepresentantePlan getRepresentantePlan() {
		return this.representantePlan;
	}

	public void setRepresentantePlan(RepresentantePlan representantePlan) {
		this.representantePlan = representantePlan;
	}

}
