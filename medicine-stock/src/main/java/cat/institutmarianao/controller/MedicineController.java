package cat.institutmarianao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.servlet.ModelAndView;

import cat.institutmarianao.repository.MedicineRepository;

@Controller
public class MedicineController {
	@Autowired
	private MedicineRepository medicineRepository;

	@InitBinder
	public void initialiseBinder(WebDataBinder binder) {
		binder.setDisallowedFields("stockInOrder");
	}

	@GetMapping(value = "/medicines")
	public ModelAndView handleRequest() {
		ModelAndView modelview = new ModelAndView("medicines");
		modelview.getModelMap().addAttribute("medicines", medicineRepository.getAllMedicines());
		return modelview;
	}
}
