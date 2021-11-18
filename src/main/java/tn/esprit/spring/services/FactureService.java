package tn.esprit.spring.services;

import java.util.List;


import tn.esprit.spring.entities.Facture;

public interface FactureService {
	List<Facture> retrieveAllFactures();
	void deleteFacture(Long id);
	Facture retrieveFacture(Long id);
	Facture addFacture(Facture f);
	Facture updateFacture(Facture f);

}
