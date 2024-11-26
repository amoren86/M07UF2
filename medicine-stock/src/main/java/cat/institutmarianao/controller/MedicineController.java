package cat.institutmarianao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import cat.institutmarianao.repository.MedicineRepository;

@Controller
public class MedicineController {
	@Autowired
	private MedicineRepository medicineRepository;

	@GetMapping(value = "/medicines")
	public ModelAndView handleRequest() {
		ModelAndView modelview = new ModelAndView("medicines");
		modelview.getModelMap().addAttribute("medicines", medicineRepository.getAllMedicines());
		return modelview;
	}
}
