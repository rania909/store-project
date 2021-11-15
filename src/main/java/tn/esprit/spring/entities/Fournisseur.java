package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Fournisseur  implements Serializable{

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idfournisseur ;
	private String codefournisseur ;
	private String libellefournisseur ;
	
	public Fournisseur() {
		super();
		
	}
	
	public Fournisseur(String codefournisseur, String libellefournisseur) {
	
		
		this.codefournisseur = codefournisseur;
		this.libellefournisseur = libellefournisseur;
	}

	public long getIdfournisseur() {
		return idfournisseur;
	}
	public void setIdfournisseur(long idfournisseur) {
		this.idfournisseur = idfournisseur;
	}
	public String getCodefournisseur() {
		return codefournisseur;
	}
	public void setCodefournisseur(String codefournisseur) {
		this.codefournisseur = codefournisseur;
	}
	public String getLibellefournisseur() {
		return libellefournisseur;
	}
	public void setLibellefournisseur(String libellefournisseur) {
		this.libellefournisseur = libellefournisseur;
	}
}
