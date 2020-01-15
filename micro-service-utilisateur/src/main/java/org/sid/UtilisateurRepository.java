package org.sid;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface UtilisateurRepository extends JpaRepository<Utilisateur,String> {
	@Query("select o from Utilisateur o")
	public List<Utilisateur> listemenbrescommission(String idcommission, Pageable pageable);

	

}
