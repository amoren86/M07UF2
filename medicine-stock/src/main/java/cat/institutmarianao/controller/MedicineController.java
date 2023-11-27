package cat.institutmarianao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cat.institutmarianao.service.MedicineService;

@Controller
@RequestMapping("/medicines")
public class MedicineController {
	@Autowired
	private MedicineService medicineService;

	@GetMapping(value = "/all")
	public ModelAndView handleRequest() {
		ModelAndView modelview = new ModelAndView("medicines");
		modelview.getModelMap().addAttribute("medicines", medicineService.getAllMedicines());
		return modelview;
	}

	@GetMapping("/{category}")
	public ModelAndView getMedicinesByCategory(@PathVariable("category") String medicineCategory) {
		ModelAndView modelview = new ModelAndView("medicines");
		modelview.getModelMap().addAttribute("medicines", medicineService.getMedicinesByCategory(medicineCategory));
		return modelview;
	}

}
