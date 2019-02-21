package formation.sopra.videoClub.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import formation.sopra.videoClub.entity.Adherent;
import formation.sopra.videoClub.entity.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {
	
	Optional<Film> findByTitre(String titre);
//	List<Film> findByNum(String titre);

}
