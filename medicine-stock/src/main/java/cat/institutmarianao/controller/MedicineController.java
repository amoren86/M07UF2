package cat.institutmarianao.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@GetMapping("/filter/{ByCriteria}")
	public ModelAndView getMedicinesByFilter(
			@MatrixVariable(pathVar = "ByCriteria") Map<String, List<String>> filterParams) {
		ModelAndView modelview = new ModelAndView("medicines");
		modelview.getModelMap().addAttribute("medicines", medicineService.getMedicinesByFilter(filterParams));
		return modelview;
	}

	@GetMapping("/medicine")
	public ModelAndView getMedicineById(@RequestParam("codi") String medicineId) {
		ModelAndView modelview = new ModelAndView("medicine");
		modelview.getModelMap().addAttribute("medicine", medicineService.getMedicineById(medicineId));
		return modelview;
	}
}
