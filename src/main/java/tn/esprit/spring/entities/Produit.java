package tn.esprit.spring.entities;



import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


import tn.esprit.spring.entities.DetailFacture;
import tn.esprit.spring.entities.DetailProduit;
import tn.esprit.spring.entities.Fournisseur;
import tn.esprit.spring.entities.Rayon;
import tn.esprit.spring.entities.Stock;

@Entity
public class Produit   implements Serializable{
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idproduit ;
	private String codeproduit ;
	private String libelleproduit ;
	private float prixunitaire ;

	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Fournisseur> fournisseurs;

	@ManyToOne(cascade = CascadeType.ALL)
	private Rayon rayon;

	@ManyToOne(cascade = CascadeType.ALL)
	private Stock stock;

	@OneToOne
	private DetailProduit detail ; 

	@OneToMany(cascade = CascadeType.ALL,mappedBy="produit")


	private Set<DetailFacture> detailfacture;
	public Produit() {
		super();
		
	}
	public Produit(String codeproduit, String libelleproduit, float prixunitaire) {
		
		this.codeproduit = codeproduit;
		this.libelleproduit = libelleproduit;
		this.prixunitaire = prixunitaire;
		
	}
	public long getIdproduit() {
		return idproduit;
	}
	public void setIdproduit(long idproduit) {
		this.idproduit = idproduit;
	}
	public String getCodeproduit() {
		return codeproduit;
	}
	public void setCodeproduit(String codeproduit) {
		this.codeproduit = codeproduit;
	}
	public String getLibelleproduit() {
		return libelleproduit;
	}
	public void setLibelleproduit(String libelleproduit) {
		this.libelleproduit = libelleproduit;
	}
	public float getPrixunitaire() {
		return prixunitaire;
	}
	public void setPrixunitaire(float prixunitaire) {
		this.prixunitaire = prixunitaire;
	}
	public Rayon getRayon() {
		return rayon;
	}
	public void setRayon(Rayon rayon) {
		this.rayon = rayon;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}

}
