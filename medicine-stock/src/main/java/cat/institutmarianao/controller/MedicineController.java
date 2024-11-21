package cat.institutmarianao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import cat.institutmarianao.domain.Medicine;

@Controller
public class MedicineController {

	@GetMapping(value = "/medicines")
	public ModelAndView handleRequest() {
		ModelAndView modelview = new ModelAndView("medicines");
		Medicine ibuprofe = new Medicine("M010", "Ibuprofé", 2);
		ibuprofe.setDescription("Ibuprofé de 600mg");
		ibuprofe.setCategory("Anti-inflamatori");
		ibuprofe.setProducer("Cinfa");
		ibuprofe.setStockQuantity(214);
		modelview.getModelMap().addAttribute("medicine", ibuprofe);
		return modelview;
	}

}
