package cat.institutmarianao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView handleRequest() {
		ModelAndView modelview = new ModelAndView("welcome");
		modelview.getModelMap().addAttribute("title", "Welcome to Medicine Stock!");
		modelview.getModelMap().addAttribute("tagline", "An application from Marianao Institute");
		return modelview;
	}
}
