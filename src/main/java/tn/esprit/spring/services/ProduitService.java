package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Produit;

public interface ProduitService {
	List<Produit> retrieveAllProduits();

	Produit addProduit(Produit p, Long idRayon, Long idStock);

	Produit retrieveProduit(Long id);
}
