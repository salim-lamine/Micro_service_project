package org.sid.web;
import java.util.List;

import org.sid.dao.CommissionRepository;
import org.sid.dao.CompteRepository;
import org.sid.dao.UtilisateurRepository;
import org.sid.entities.Commission;
import org.sid.entities.Compte;
import org.sid.entities.Utilisateur;
import org.sid.metier.IcompteMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CompteController{
	@Autowired
	private IcompteMetier comptemetier;
	@Autowired
	private UtilisateurRepository utilisateurrepository;
	@Autowired
	private CommissionRepository commissionrepository;
	@Autowired
	private CompteRepository compterepository;

	
	@RequestMapping(value="/utilisateurs",method=RequestMethod.GET)
	@ResponseBody
public List<Utilisateur> consulterutilisateurs() {
		  List<Utilisateur> page1= utilisateurrepository.findAll();
			return page1;}
	@RequestMapping(value="/utilisateurs/{id}",method=RequestMethod.GET)
	@ResponseBody
public Utilisateur consulterutilisateursid(@PathVariable String id) {
		  Utilisateur page1= utilisateurrepository.findOne(id);
			return page1;}
	
	@RequestMapping(value="/comptes",method=RequestMethod.GET)
	@ResponseBody
public List<Compte> consultercomptes() {
		  List<Compte> page2= compterepository.findAll();
			return page2;}
	
	@RequestMapping(value="/commissions",method=RequestMethod.GET)
	@ResponseBody
public List<Commission> consultercommissions() {
		  List<Commission> page2= commissionrepository.findAll();
			return page2;}
	
	
	
	
	@RequestMapping(value="/saveuser/{nom}/{role}/{commission}", method=RequestMethod.POST)
	@ResponseBody
	public void saveuser(@PathVariable("nom") String nom,@PathVariable("role") String role,@PathVariable("commission")Commission cc){
		
		
			comptemetier.ajouterutilisateur("22", nom,role,cc);
			
	}
}
