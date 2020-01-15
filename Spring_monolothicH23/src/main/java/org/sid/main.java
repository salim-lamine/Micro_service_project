package org.sid;
import org.sid.dao.CommissionRepository;
import org.sid.dao.CompteRepository;
import org.sid.dao.UtilisateurRepository;
import org.sid.entities.Commission;
import org.sid.entities.Compte;
import org.sid.entities.Utilisateur;
import org.sid.metier.IcompteMetierImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class main implements CommandLineRunner{
    @Autowired
	private UtilisateurRepository utilisateurrepository;
    @Autowired
    private CompteRepository compterepository;
	
	@Autowired
	private CommissionRepository commissionrepository;
	    
    public static void main(String[] args) {
		SpringApplication.run(main.class, args);}

	@Override
	public void run(String... args) throws Exception {
		
		Commission commission2=commissionrepository.save(new Commission("touristique") );
		Commission commission3=commissionrepository.save(new Commission("urbain") );
		
		Utilisateur u1 =new Utilisateur("1","salim","ADMIN",null);
		u1.setCommission(commission2);
		u1=utilisateurrepository.save(u1);
		Utilisateur u2= new Utilisateur("2","assawer","USER",null);
		u2.setCommission(commission3);
		u2=utilisateurrepository.save(u2);
		
	
		Compte C1=compterepository.save(new Compte("c1","admin","salim.lamine@gmail.com",u1));
		Compte C2=compterepository.save(new Compte("c2","Simple membre","assawer.bahri@gmail.com",u2));
       
	
		
		
		
	}
}
		