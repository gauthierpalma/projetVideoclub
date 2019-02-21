package formation.sopra.videoClub.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import formation.sopra.videoClub.entity.Adherent;

@Repository
public interface AdherentRepository extends JpaRepository<Adherent, Long> {

	// Query DLS --> logic Name
Optional<Adherent> findById(Long id);
//
//	List<Adherent> findByTeamId(long teamId);
//
//	@Query("select p from Adherent p left join fetch p.team")
//	List<Adherent> findAllWithTeam();
//
//	@Query("select p from Adherent p left join fetch p.team where p.id=?1")
//	Optional<Adherent> findByIdWithTeam(Long id); //Optional, qui permet d’encapsuler un objet dont la valeur peut être null. 
}
