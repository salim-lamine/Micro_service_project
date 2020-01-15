package org.sid.metier;

import java.util.List;

import org.sid.dao.CommissionRepository;
import org.sid.dao.CompteRepository;

import org.sid.dao.UtilisateurRepository;
import org.sid.entities.Commission;
import org.sid.entities.Compte;
import org.sid.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class IcompteMetierImpl implements IcompteMetier {
	@Autowired
	private CompteRepository compterepository;
	@Autowired
	private UtilisateurRepository utilisateurrepository;
	
	@Autowired
	private CommissionRepository commissionrepository;

	@Override
	public void ajouterutilisateur(String idu,String nom,String titre,Commission cc) {
		Utilisateur u=new Utilisateur(idu, nom,titre,cc);
		utilisateurrepository.save(u);
		
	}

	@Override
	public List<Compte> listecompte() {
		
		return compterepository.listecompte();
	}
	@Override
	public List<Utilisateur> listemenbrescommission(String idcommission,int page,int size) {
		
		return utilisateurrepository.listemenbrescommission(idcommission,new PageRequest(page,size));
	}


	}
	

