package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Produit;
import tn.esprit.spring.repository.ProduitRepository;
import tn.esprit.spring.repository.StockRepository;
import tn.esprit.spring.repository.RayonRepository;
import tn.esprit.spring.services.ProduitService;

@Service
public class ProduitServiceImpl implements ProduitService {
	@Autowired
	ProduitRepository produitrepository ; 
	StockRepository stockrepository;
	RayonRepository rayonrepositori;
	@Override
	public List<Produit> retrieveAllProduits() {
		List<Produit> produits=(List<Produit>) produitrepository.findAll();
		return produits;
	}

	@Override
	public Produit addProduit(Produit p, Long idRayon, Long idStock) {
		p.setRayon(rayonrepositori.findById(idRayon).get());
		p.setStock(stockrepository.findById(idStock).get());
		produitrepository.save(p);
		return p;
	}

	@Override
	public Produit retrieveProduit(Long id) {
		Produit p =produitrepository.findById(id).get();
		return p;
	}

}
