package org.sid.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public  class Compte implements Serializable{

	
	private String idcompte;
	@Id
	private String nom;
	private String email;
	@ManyToOne
	@JoinColumn(name="cpt_user")
	 Utilisateur utilisateur;
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilsateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Compte( String id,String nom, String email) {
		super();
		this.idcompte=id;
		this.nom = nom;
		this.email = email;
		}
	public Compte( String code,String nom, String email,Utilisateur u) {
		super();
		this.idcompte=code;
		this.nom = nom;
		this.email = email;
		this.utilisateur=u;
		}
	public Compte() {
		super();
	}
	public String getIdcompte() {
		return idcompte;
	}
	public void setIdcompte(String c) {
		this.idcompte = c;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
