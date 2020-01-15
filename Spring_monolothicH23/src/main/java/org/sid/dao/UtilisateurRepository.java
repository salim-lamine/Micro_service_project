package org.sid.dao;
import java.util.List;

import org.sid.entities.Utilisateur;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,String> {
	@Query("select o from Utilisateur o")
	public List<Utilisateur> listemenbrescommission(String idcommission, Pageable pageable);

	public Utilisateur findOne(String id);
	

}
