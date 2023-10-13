package classes;


import java.util.Date;

public class compte {

	private double solde;
	private Date dateCreation;
	private int code;
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public compte(double solde, Date dateCreation, int code) {
		super();
		this.solde = solde;
		this.dateCreation = dateCreation;
		this.code = code;
	}
	
	
	
}
