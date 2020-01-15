package org.sid;
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

public Utilisateur(String id, String nom,String titre) {
	super();
	this.id = id;
	this.nom = nom;
	this.titre=titre;
	
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
