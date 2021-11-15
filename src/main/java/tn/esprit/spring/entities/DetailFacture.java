package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import tn.esprit.spring.entities.Facture;
import tn.esprit.spring.entities.Produit;
@Entity
public class DetailFacture implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
private long iddetailfacture ;
private int quantite ;
private float prixtotal ;
private int pourcentageremise; 
private int montantremise ;
@ManyToOne
private Facture facture;
@ManyToOne
private Produit produit ;
public long getIddetailfacture() {
	return iddetailfacture;
}
public void setIddetailfacture(long iddetailfacture) {
	this.iddetailfacture = iddetailfacture;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public float getPrixtotal() {
	return prixtotal;
}
public void setPrixtotal(float prixtotal) {
	this.prixtotal = prixtotal;
}
public int getPourcentageremise() {
	return pourcentageremise;
}
public void setPourcentageremise(int pourcentageremise) {
	this.pourcentageremise = pourcentageremise;
}
public int getMontantremise() {
	return montantremise;
}
public void setMontantremise(int montantremise) {
	this.montantremise = montantremise;
}

}
