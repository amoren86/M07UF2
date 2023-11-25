package cat.institutmarianao.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cat.institutmarianao.domain.Medicine;
import cat.institutmarianao.service.MedicineService;

@Controller
@RequestMapping("/medicines")
public class MedicineController {
	@Autowired
	private MedicineService medicineService;

	@InitBinder
	public void initialiseBinder(WebDataBinder binder) {
		binder.setDisallowedFields("stockInOrder");
	}

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

	@GetMapping(value = "/add")
	public ModelAndView getAddNewMedicineForm() {
		ModelAndView modelview = new ModelAndView("addMedicine");
		Medicine newMedicine = new Medicine();
		modelview.getModelMap().addAttribute("newMedicine", newMedicine);
		return modelview;
	}

	@PostMapping(value = "/add")
	public String processAddNewMedicineForm(@ModelAttribute("newMedicine") Medicine newMedicineToAdd,
			BindingResult result) {
		String[] suppressedFields = result.getSuppressedFields();
		if (suppressedFields.length > 0) {
			throw new RuntimeException("Attempting to bind disallowed fields: "
					+ StringUtils.arrayToCommaDelimitedString(suppressedFields));
		}
		medicineService.addMedicine(newMedicineToAdd);
		return "redirect:/medicines/all";
	}

}
