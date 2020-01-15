package org.sid;

import org.sid.Utilisateur;
import org.sid.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class MicroServiceCompteApplication {
	@Autowired
	private UtilisateurRepository utilisateurrepository;
	public static void main(String[] args) {
		SpringApplication.run(MicroServiceCompteApplication.class, args);
	}
	public void run(String... args) throws Exception {
		
		
		Utilisateur u1 =new Utilisateur("1","salim","ADMIN");
		
		u1=utilisateurrepository.save(u1);
		Utilisateur u2= new Utilisateur("2","assawer","USER");
		u2=utilisateurrepository.save(u2);
		
}}