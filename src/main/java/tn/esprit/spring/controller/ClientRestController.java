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

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.services.ClientService;
@RestController
@RequestMapping("/client")
public class ClientRestController {
	@Autowired
	ClientService clientservice;

	// URL: http://localhost:8081/SpringMVC/servlet/getallclient
	@GetMapping("getallclient")
	public List<Client> retrieveAllClient(){
		return clientservice.retrieveAllClient(); 
	}
	
	// URL: http://localhost:8081/SpringMVC/servlet/client/addclient
	@PostMapping("/addClients")
	@ResponseBody
	public Client addClient(@RequestBody Client c)
	{
	Client client = clientservice.addClient(c);
	return client;
	}
	
	
	// URL: http://localhost:8081/SpringMVC/servlet/removeclient/{client-id}
	@DeleteMapping("removeclient/{client-id}")
	public void removeClient(@PathVariable("client-id") Long id) {
		clientservice.deleteClient(id);
		}
	
	
	// URL: http://localhost:8089/SpringMVC/servlet/modifyclient
	@PutMapping("modifyclient")
	public Client modifyClient(Client u){
		return clientservice.updateClient(u);
	}
} 
