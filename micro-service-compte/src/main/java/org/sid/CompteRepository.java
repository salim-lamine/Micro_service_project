package org.sid;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte,String> {
	@Query("select oc from Compte oc ")
	public List<Compte> listecompte();
}