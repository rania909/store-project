package tn.esprit.spring.entities;

import java.io.Serializable;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import tn.esprit.spring.entities.Produit;
@Entity
public class Rayon implements Serializable {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idrayon ;	
	private String coderayon ;
	private String libelle ;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="rayon")
	private Set <Produit> produits;
	public long getIdrayon() {
		return idrayon;
	}
	public void setIdrayon(long idrayon) {
		this.idrayon = idrayon;
	}
	public String getCoderayon() {
		return coderayon;
	}
	public void setCoderayon(String coderayon) {
		this.coderayon = coderayon;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


}
