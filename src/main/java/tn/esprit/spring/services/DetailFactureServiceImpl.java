package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.DetailFacture;
import tn.esprit.spring.entities.Facture;
import tn.esprit.spring.repository.DetailFactureRepository;

@Service
public class DetailFactureServiceImpl implements DetailFactureService{
	@Autowired
	DetailFactureRepository dfr;

	@Override
	public List<DetailFacture>retrieveAllDetailFacture(){
		List<DetailFacture> df = (List<DetailFacture>) dfr.findAll();
		return df;
	}


	
	@Override
	public void deleteDetailFacture(Long id){
		dfr.deleteById(id);
	}

	@Override
	public DetailFacture  retrieveDetailFactures(Long id) {
		DetailFacture df = dfr.findById(id).get();
		return df;
	}
	
	@Override
	public DetailFacture addDetailFacture(DetailFacture df){
		return dfr.save(df);
	}



	@Override
	public DetailFacture updateDetailFacture(DetailFacture df) {
		if(dfr.existsById(df.getIddetailfacture())){
			DetailFacture sf=dfr.findById(df.getIddetailfacture()).get();
			//f.setActive();
			df.setIddetailfacture(df.getIddetailfacture());
			df.setQuantite(df.getQuantite());
			df.setPrixtotal(df.getPrixtotal());
			df.setPourcentageremise(df.getPourcentageremise());
			df.setMontantremise(df.getMontantremise());
			dfr.save(df);
			
			
		}
		return df;
	}

}
