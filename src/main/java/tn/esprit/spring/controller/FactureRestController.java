package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Facture;
import tn.esprit.spring.services.FactureService;

@RestController
@RequestMapping("/facture")
public class FactureRestController {
	@Autowired
	FactureService factureservice;
	
	
	// URL: http://localhost:8085/SpringMVC/servlet/facture/addfacture
	@PostMapping("/addfacture")
	@ResponseBody
	public Facture addFacture(@RequestBody Facture f){
		Facture facture =factureservice.addFacture(f);
		return  facture;
		
	}
	
	// URL: http://localhost:8085/SpringMVC/servlet/facture/getallfacture
	@GetMapping("/getallfacture")
	public List<Facture> getFacture(){
		List <Facture> listfacture = factureservice.retrieveAllFactures();
		return listfacture;
		
	} 
	
	// URL: http://localhost:8087/SpringMVC/servlet/facture/getfacture/1
	@GetMapping("getfacture/{idfacture}")
	@ResponseBody
	public Facture retrieveFacture(@PathVariable("idfacture") Long idfacture){
		return factureservice.retrieveFacture(idfacture);
		
	}
	// URL: http://localhost:8087/SpringMVC/servlet/facture/modifyfacture
	@PutMapping("/modifyfacture")
	@ResponseBody
	public Facture modifyFacture(@RequestBody Facture facture){
		return factureservice.updateFacture(facture);
	}
	
	// URL: http://localhost:8092/SpringMVC/servlet/facture/removefacture
	@DeleteMapping("/removefacture/{idfacture}")
	@ResponseBody
	public void removeFacture(@PathVariable("idfacture") Long idfacture) {
		factureservice.deleteFacture(idfacture);
		}
	
	
	
	

}
