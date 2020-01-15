package org.sid.entities;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Utilisateur implements Serializable {
@Id 
String id;
String nom;
String titre;
@ManyToOne
Commission commission;
public Commission getCommission() {
return commission;
}
public void setCommission(Commission commission) {
	this.commission = commission;
}
public Utilisateur(String id, String nom,String titre,Commission c) {
	super();
	this.id = id;
	this.nom = nom;
	this.titre=titre;
	this.commission=c;
	
    }
	public Utilisateur() {
		super();
	}

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getTitre() {
	return titre;
}
public void setTitre(String mdp) {
	this.titre = mdp;
}

}
