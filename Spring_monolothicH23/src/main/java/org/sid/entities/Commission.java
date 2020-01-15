package org.sid.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Commission implements Serializable {
@Id
String nom;

ArrayList<String> pointavoter=new ArrayList<String>();
ArrayList<String> remarque=new ArrayList<String>();

public Commission() {
	super();
}
public Commission(String nom) {
	super();
	this.nom = nom;
}

public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public ArrayList<String> getPointavoter() {
	return pointavoter;
}
public void setPointavoter(String pointavoter) {
	this.pointavoter.add(pointavoter);
}
public ArrayList<String> getRemarque() {
	return remarque;
}
public void setRemarque(String remarque) {
	this.remarque.add(remarque);
}

 
}
