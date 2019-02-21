package formation.sopra.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import formation.sopra.entity.Adherent;

import formation.sopra.repository.AdherentRepository;


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
	public String delete(@RequestParam(name = "noAdherent") int noAdherent, Model model) {
		adherentRepository.deleteById(noAdherent);
		return "redirect:/adherent/list";
	}

	@GetMapping("/edit")
	public String edit(@RequestParam(name = "noAdherent") Long noAdherent, Model model) {
		Optional<Adherent> opt = adherentRepository.findById(noAdherent);
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

	@PostMapping("/save")
	public ModelAndView save(@Valid @ModelAttribute(name = "adherent") Adherent adherent, BindingResult br) {
		if (br.hasErrors()) {
			return goEdit(adherent);
		}
		adherentRepository.save(adherent);
		return new ModelAndView("redirect:/adherent/list");
	}

}
