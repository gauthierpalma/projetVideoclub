package formation.sopra.videoClub.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import formation.sopra.videoClub.entity.User;
import formation.sopra.videoClub.repository.UserRepository;

public class CustomUserDetailsService {

	@Autowired
	UserRepository userRepository;
	
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> opt = userRepository.findById(username);
		if(opt.isPresent()) {
			return new CustomUserDetails(opt.get());
		}
	throw new UsernameNotFoundException("Erreur de saisie, merci de reessayer.");
	
	}
	
}
