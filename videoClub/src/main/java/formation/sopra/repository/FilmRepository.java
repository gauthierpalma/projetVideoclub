package formation.sopra.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import formation.sopra.entity.Team;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {
	
	Optional<Film> findByName(String titre);
}
