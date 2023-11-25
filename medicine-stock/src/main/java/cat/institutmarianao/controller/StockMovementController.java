package cat.institutmarianao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cat.institutmarianao.service.StockMovementService;

@Controller
public class StockMovementController {
	@Autowired
	private StockMovementService stockMovementService;

	@GetMapping("/stockmovement/{id}/{qty}/{sign}")
	public String process(@PathVariable("id") String medicineId, @PathVariable("qty") int stockQty,
			@PathVariable("sign") int stockSign) {
		stockMovementService.processStockMovement(medicineId, stockQty, stockSign);
		return "redirect:/medicines/all";
	}
}
