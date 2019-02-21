package formation.sopra.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import formation.sopra.entity.Adherent;

@Repository
public interface AdherentRepository extends JpaRepository<Adherent, Long> {

	// Query DLS --> logic Name
//	List<Adherent> findByNum(int numId);
//
//	List<Adherent> findByTeamId(long teamId);
//
//	@Query("select p from Adherent p left join fetch p.team")
//	List<Adherent> findAllWithTeam();
//
//	@Query("select p from Adherent p left join fetch p.team where p.id=?1")
//	Optional<Adherent> findByIdWithTeam(Long id);
}
