package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.CategorieClient;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Profession;

public interface ClientService {
	List<Client> retrieveAllClient();
	Client addClient(Client u);
	void deleteClient(Long id);
	Client updateClient(Client u);
	Client retrieveClient(Long id);
	List<Client> retrieveClientsByProfession(Profession prof);
	long updateClientCategorieByProfession(CategorieClient categorieClient,Profession profession);
	long deleteClientByCategorieClientAndProfessionb(CategorieClient categorieclient,Profession profession);
	long insertClient(String nom, String prenom,String dateNaissance,  String email,String password,  Profession profession, CategorieClient categorieClient);

}
