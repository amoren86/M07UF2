package cat.institutmarianao;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping(value = "/login")
	public String login() {
		return "login";
	}

	@GetMapping(value = "/loginfailed")
	public String loginerror(Model model) {
		model.addAttribute("error", "true");
		return "login";
	}

	@GetMapping(value = "/logout")
	public String logout(Model model) {
		return "login";
	}
}