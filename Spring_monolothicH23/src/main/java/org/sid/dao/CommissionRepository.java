package org.sid.dao;

import java.util.List;

import org.sid.entities.Commission;
import org.sid.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CommissionRepository extends JpaRepository<Commission,String>{
	@Query("select oc from Commission oc ")
	public List<Compte> listecommission();	
}
