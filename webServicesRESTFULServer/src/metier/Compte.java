package metier;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;

@XmlRootElement  // l'annotation jackon ( json ) renconnait l'annotation JAXB (xml). On pourrait enlever cette annotation.
public class Compte implements Serializable {

	private int code;
	private double solde;
	private Date dateCreation;

	public Compte() {
		super();
	}

	public Compte(int code, double solde, Date dateCreation) {
		super();
		this.code = code;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	// @JsonIgnore // Not return dataCreation attribute ( jackson annotation )
	@XmlTransient // Not return dataCreation attribute ( jaxb annotation  )
	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

}
