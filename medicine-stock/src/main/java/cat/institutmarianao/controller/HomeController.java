package cat.institutmarianao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping(value = "/")
	public ModelAndView handleRequest() {
		ModelAndView modelview = new ModelAndView("welcome");
		modelview.getModelMap().addAttribute("title", "Medicine Stock");
		modelview.getModelMap().addAttribute("tagline", "An Institut Marianao application");
		return modelview;
	}
}
