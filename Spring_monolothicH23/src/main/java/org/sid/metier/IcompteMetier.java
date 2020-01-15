package org.sid.metier;
import java.util.List;

import org.sid.entities.Commission;
import org.sid.entities.Compte;
import org.sid.entities.Utilisateur;

public interface IcompteMetier {
	public void ajouterutilisateur(String idu,String nom,String titre,Commission c);
  	public List<Utilisateur> listemenbrescommission(String idcommission, int page, int size);
     public  List<Compte> listecompte();
}
