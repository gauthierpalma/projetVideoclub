package formation.sopra.videoClub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;

import formation.sopra.videoClub.entity.User;
import formation.sopra.videoClub.repository.UserRepository;

public class ConsoleApplicationService implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;
	
	
	@Autowired
	private PasswordEncoder passwordEncoder;


@Override
public void run(String... args) throws Exception{
//	List<User> users = userRepository.findAll();
//	for (User user : users) {
//		user.setPassword(passwordEncoder.encode(user.getPassword()));
//		userRepository.save(user);
//	}
}

}
