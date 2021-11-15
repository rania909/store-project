package tn.esprit.spring.entities;

import java.io.Serializable;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity 
public class Facture implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idfacture ;
	private float montantremise;
	private float montantfacture;
	private boolean active;
	@Temporal (TemporalType.DATE)
	private Date datefacture ;
	@ManyToOne
	private Client client ; 
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="facture")
	private Set<DetailFacture> detailfacture ;
	
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Facture(float montantremise, float montantfacture, boolean active,Client client) {
		super();
		this.montantremise = montantremise;
		this.montantfacture = montantfacture;
		this.active = active;
		this.datefacture = datefacture;
		this.client=client;
	}
	public long getIdfacture() {
		return idfacture;
	}
	public void setIdfacture(long idfacture) {
		this.idfacture = idfacture;
	}
	public float getMontantremise() {
		return montantremise;
	}
	public void setMontantremise(float montantremise) {
		this.montantremise = montantremise;
	}
	public float getMontantfacture() {
		return montantfacture;
	}
	public void setMontantfacture(float montantfacture) {
		this.montantfacture = montantfacture;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Date getDatefacture() {
		return datefacture;
	}
	public void setDatefacture(Date datefacture) {
		this.datefacture = datefacture;
	}
	

}
