package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Rayon;

public interface RayonService {
	List<Rayon> retrieveAllRayon();
    Rayon addRayon(Rayon u);
	void deleteRayon(Long id);
	Rayon updateRayon(Rayon u);
	Rayon retrieveRayon(Long id);

}
