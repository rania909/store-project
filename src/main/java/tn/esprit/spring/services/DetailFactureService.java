package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.DetailFacture;


public interface DetailFactureService {

	List<DetailFacture> retrieveAllDetailFacture();
	void deleteDetailFacture(Long id);
	DetailFacture retrieveDetailFactures(Long id);
	DetailFacture addDetailFacture(DetailFacture df);
	DetailFacture updateDetailFacture(DetailFacture df);
}
