package tn.esprit.spring;
import java.util.HashSet;


import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import tn.esprit.spring.*;
import tn.esprit.spring.services.*;
import tn.esprit.spring.repository.*;
import tn.esprit.spring.entities.*;
import tn.esprit.spring.controller.*;


@SpringBootApplication
public class ProjetSpringApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetSpringApplication.class, args);
	}


	}

