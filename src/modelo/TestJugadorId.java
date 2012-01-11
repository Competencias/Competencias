package modelo;

// Generated 10/01/2012 04:06:24 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TestJugadorId generated by hbm2java
 */
@Embeddable
public class TestJugadorId implements java.io.Serializable {

	private int codigoIndicadorTest;
	private int codigoRoster;

	public TestJugadorId() {
	}

	public TestJugadorId(int codigoIndicadorTest, int codigoRoster) {
		this.codigoIndicadorTest = codigoIndicadorTest;
		this.codigoRoster = codigoRoster;
	}

	@Column(name = "codigo_indicador_test", nullable = false)
	public int getCodigoIndicadorTest() {
		return this.codigoIndicadorTest;
	}

	public void setCodigoIndicadorTest(int codigoIndicadorTest) {
		this.codigoIndicadorTest = codigoIndicadorTest;
	}

	@Column(name = "codigo_roster", nullable = false)
	public int getCodigoRoster() {
		return this.codigoRoster;
	}

	public void setCodigoRoster(int codigoRoster) {
		this.codigoRoster = codigoRoster;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TestJugadorId))
			return false;
		TestJugadorId castOther = (TestJugadorId) other;

		return (this.getCodigoIndicadorTest() == castOther
				.getCodigoIndicadorTest())
				&& (this.getCodigoRoster() == castOther.getCodigoRoster());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoIndicadorTest();
		result = 37 * result + this.getCodigoRoster();
		return result;
	}

}
