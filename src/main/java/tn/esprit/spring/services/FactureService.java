package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Facture;

public interface FactureService {
	List<Facture> retrieveAllFactures();
	void cancelFacture(Long id);
	Facture retrieveFacture(Long id);

}
