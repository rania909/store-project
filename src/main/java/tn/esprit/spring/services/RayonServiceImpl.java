package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Rayon;
import tn.esprit.spring.repository.RayonRepository;
import tn.esprit.spring.services.RayonService;

@Service
public class RayonServiceImpl  implements RayonService{
	@Autowired
	RayonRepository rayonrep;
	

	@Override
	public List<Rayon> retrieveAllRayon() {
		
		return (List<Rayon>) rayonrep.findAll();
	}

	@Override
	public Rayon addRayon(Rayon u) {
		return rayonrep.save(u);
	}

	@Override
	public void deleteRayon(Long id) {
		rayonrep.deleteById(id);
	}

	@Override
	public Rayon updateRayon(Rayon u) {
		return rayonrep.save(u);
	}

	@Override
	public Rayon retrieveRayon(Long id) {
		
		return rayonrep.findById(id).get();
	}
}
