package formation.sopra.videoClub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthentificationController {

	
	@RequestMapping("/login")
	public String login(Model model) {
	return "login";
	}
}
