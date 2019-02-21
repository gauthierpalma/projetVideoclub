package formation.sopra.videoClub.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import formation.sopra.videoClub.entity.Adherent;
import formation.sopra.videoClub.repository.AdherentRepository;


@Controller
@RequestMapping("/adherent")
public class AdherentController {

	@Autowired
	private AdherentRepository adherentRepository;



	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("listeAdherent", adherentRepository.findAll());
		return "adherent/list";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam(name = "id") Long id, Model model) {
		adherentRepository.deleteById(id);
		return "redirect:/adherent/list";
	}

	@GetMapping("/edit")
	public String edit(@RequestParam(name = "id") Long id, Model model) {
		Optional<Adherent> opt = adherentRepository.findById(id);
		Adherent adherent = null;
		if (opt.isPresent()) {
			adherent = opt.get();
		} else {
			adherent = new Adherent();
		}
		return goEdit(adherent, model);
	}

	@GetMapping("/add")
	public String add(Model model) {
		return goEdit(new Adherent(), model);
	}

	private String goEdit(Adherent adherent, Model model) {
		model.addAttribute("adherent", adherent);
	
		return "adherent/edit";
	}

//	@PostMapping("/save")
//	public ModelAndView save(@Valid @ModelAttribute(name = "adherent") Adherent adherent, BindingResult br) {
//		if (br.hasErrors()) {
//			return goEdit(adherent);
//		}
//		adherentRepository.save(adherent);
//		return new ModelAndView("redirect:/adherent/list");
//	}

}
