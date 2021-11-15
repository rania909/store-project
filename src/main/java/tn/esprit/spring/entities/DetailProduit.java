package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import tn.esprit.spring.entities.CategorieProduit;
import tn.esprit.spring.entities.Produit;
@Entity
public class DetailProduit implements Serializable {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long iddetailproduit ;
	@Temporal(TemporalType.DATE)
	private Date date_creation ;
	@Temporal(TemporalType.DATE)
	private Date date_dermodification ;
	@Enumerated(EnumType.STRING)
	private CategorieProduit categorieproduit ;
	@OneToOne(mappedBy="detail")
	private Produit produit ; 
	
	public DetailProduit(CategorieProduit categorieproduit) {
		this.categorieproduit = categorieproduit;
	}
	public DetailProduit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIddetailproduit() {
		return iddetailproduit;
	}
	public void setIddetailproduit(long iddetailproduit) {
		this.iddetailproduit = iddetailproduit;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public Date getDate_dermodification() {
		return date_dermodification;
	}
	public void setDate_dermodification(Date date_dermodification) {
		this.date_dermodification = date_dermodification;
	}
	public CategorieProduit getCategorieproduit() {
		return categorieproduit;
	}
	public void setCategorieproduit(CategorieProduit categorieproduit) {
		this.categorieproduit = categorieproduit;
	}
}
