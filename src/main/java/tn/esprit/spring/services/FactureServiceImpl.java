package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Facture;
import tn.esprit.spring.repository.FactureRepository;
import tn.esprit.spring.services.FactureService;

@Service
public class FactureServiceImpl implements FactureService {
	@Autowired
	FactureRepository facturerepository ;
	@Override
	public List<Facture> retrieveAllFactures() {
		List<Facture> factures = (List<Facture>) facturerepository.findAll();
		return factures;
	}


	
	@Override
	public void deleteFacture(Long id){
		facturerepository.deleteById(id);
	}

	@Override
	public Facture retrieveFacture(Long id) {
		Facture f = facturerepository.findById(id).get();
		return f;
	}
	
	@Override
	public Facture addFacture(Facture f){
		return facturerepository.save(f);
	}
	
	@Override
	public Facture updateFacture(Facture f){
		if(facturerepository.existsById(f.getIdfacture())){
			Facture sf=facturerepository.findById(f.getIdfacture()).get();
			//f.setActive();
			f.setDatefacture(f.getDatefacture());
			f.setMontantfacture(f.getMontantfacture());
			f.setMontantremise(f.getMontantremise());
			facturerepository.save(f);
			
			
		}
		return f;
	}

}
