package org.sid.dao;

import java.util.List;

import org.sid.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CompteRepository extends JpaRepository<Compte,String> {
	@Query("select oc from Compte oc ")
	public List<Compte> listecompte();
}