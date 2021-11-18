package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.CategorieClient;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Profession;
import tn.esprit.spring.repository.ClientRepository;
@Service
public class ClientServiceImpl implements ClientService {
	@Autowired
	ClientRepository clientrepository;
	
	public List<Client> retrieveAllClient() {
        List <Client> clients = (List<Client>) clientrepository.findAll();
		return clients;
	}

	
	public Client addClient(Client client) {
		return clientrepository.save(client);
	}

	public void deleteClient(Long id) {
		clientrepository.deleteById(id);
		
	}

	
	public Client updateClient(Client u) {
		if (clientrepository.existsById(u.getIdclient())){
			Client r = clientrepository.findById(u.getIdclient()).get();
			r.setEmail(u.getEmail());
			r.setNom(u.getNom());
			r.setPrenom(u.getPrenom());
			r.setPassword(u.getPassword());
			clientrepository.save(r);
		}
		return u;
	}

	
	public Client retrieveClient(Long id) {
		Client c =clientrepository.findById(id).get();
		return c;
	}

	
	public List<Client> retrieveClientsByProfession(Profession p) {

		return clientrepository.retrieveClientsByProfession(p);
	}


	public long updateClientCategorieByProfession(CategorieClient categorieClient, Profession profession) {
		
		return clientrepository.updateClientCategorieByProfession(categorieClient, profession);
	}

	public long deleteClientByCategorieClientAndProfessionb(CategorieClient categorieclient, Profession profession) {
		
		return clientrepository.deleteClientByCategorieClientAndProfession(categorieclient, profession);
	}
	
	public long insertClient(String nom, String prenom,String dateNaissance,  String email,String password,  Profession profession, CategorieClient categorieClient) {
		
		return clientrepository.insertClient(nom, prenom, dateNaissance, email, password, profession, categorieClient);
	}
}
