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
public class Stock implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idstock ;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="stock")
	private Set <Produit> produits;

	public long getIdstock() {
		return idstock;
	}
	public void setIdstock(long idstock) {
		this.idstock = idstock;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public int getQuanite_min() {
		return quanite_min;
	}
	public void setQuanite_min(int quanite_min) {
		this.quanite_min = quanite_min;
	}
	public String getLibellestock() {
		return libellestock;
	}
	public void setLibellestock(String libellestock) {
		this.libellestock = libellestock;
	}
	private int quantite ;
	private int quanite_min ; 
	private String libellestock ;

}
