package org.sid;

import org.sid.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class MicroServiceCompteApplication {
	 @Autowired
	    private CompteRepository compterepository;
	public static void main(String[] args) {
		SpringApplication.run(MicroServiceCompteApplication.class, args);}
		public void run(String... args) throws Exception {
			
		
			Compte C1=compterepository.save(new Compte("c1","admin","salim.lamine@gmail.com"));
			Compte C2=compterepository.save(new Compte("c2","Simple membre","assawer.bahri@gmail.com"));
	       
		
	}

}
