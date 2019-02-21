package formation.sopra.videoClub.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import formation.sopra.videoClub.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
	@Query("select u from User u where u.username=?1")
	Optional<User> findByUsernameWithRole(String username);
}
