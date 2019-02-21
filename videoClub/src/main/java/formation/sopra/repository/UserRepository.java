package formation.sopra.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import formation.sopra.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
	@Query("select u from User u left join fetch u.roles where u.username=?1")
	Optional<User> findByUsernameWithRole(String username);
}
