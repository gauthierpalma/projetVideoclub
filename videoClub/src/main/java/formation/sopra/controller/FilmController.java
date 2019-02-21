package formation.sopra.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import formation.sopra.entity.Film;
import formation.sopra.repository.FilmRepository;

@Controller
@RequestMapping("/film")
public class FilmController {
	@Autowired
	private FilmRepository filmRepository;

	@GetMapping("/list")
	public ModelAndView list() {
		return new ModelAndView("film/list", "films", filmRepository.findAll());
	}

	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam(name = "titre") String titre) {
		filmRepository.deleteById(titre);
		return new ModelAndView("redirect:/film/list");
	}

	@GetMapping("/edit")
	public ModelAndView edit(@RequestParam(name = "titre") String titre) {
		Optional<Film> opt = filmRepository.findById(titre);
		Film film = null;
		if (opt.isPresent()) {
			film = opt.get();
		} else {
			film = new Film();
		}
		return goEdit(film);
	}

	@GetMapping("/add")
	public ModelAndView add() {
		return goEdit(new Film());
	}

	private ModelAndView goEdit(Film film) {
		ModelAndView modelAndView = new ModelAndView("film/edit");
		modelAndView.addObject("film", film);
		return modelAndView;
	}

	@PostMapping("/save")
	public ModelAndView save(@Valid @ModelAttribute(name = "film") Film film, BindingResult br) {
		if (br.hasErrors()) {
			return goEdit(film);
		}
		filmRepository.save(film);
		return new ModelAndView("redirect:/film/list");
	}
}
