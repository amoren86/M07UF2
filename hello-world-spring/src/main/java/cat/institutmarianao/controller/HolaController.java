package cat.institutmarianao.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HolaController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ModelAndView modelview = new ModelAndView("resposta");
		modelview.getModelMap().addAttribute("salutacio", "Hola a tothom");
		return modelview;
	}

	@RequestMapping(value = "/bondia", method = RequestMethod.GET)
	public ModelAndView handleRequestDia(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ModelAndView modelview = new ModelAndView("resposta");
		modelview.getModelMap().addAttribute("salutacio", "Bon dia a tothom");
		return modelview;
	}

	@RequestMapping(value = "/bonanit", method = RequestMethod.GET)
	public ModelAndView handleRequestNit(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ModelAndView modelview = new ModelAndView("resposta");
		modelview.getModelMap().addAttribute("salutacio", "Bona nit a tothom");
		return modelview;
	}
}