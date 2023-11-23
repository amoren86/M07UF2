package cat.institutmarianao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HolaController {

	@GetMapping
	public ModelAndView handleRequest() {
		ModelAndView modelview = new ModelAndView("response");
		modelview.getModelMap().addAttribute("greetings", "Hello everybody!!");
		return modelview;
	}

	@GetMapping(value = "/goodmorning")
	public ModelAndView handleRequestDia() {
		ModelAndView modelview = new ModelAndView("resposta");
		modelview.getModelMap().addAttribute("greetings", "Good morning everyone!");
		return modelview;
	}

	@GetMapping(value = "/goodafternoon")
	public ModelAndView handleRequestNit() {
		ModelAndView modelview = new ModelAndView("resposta");
		modelview.getModelMap().addAttribute("greetings", "Good afternoon everyone!");
		return modelview;
	}
}
