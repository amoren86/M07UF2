package cat.institutmarianao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.institutmarianao.domain.Medicine;
import cat.institutmarianao.repository.MedicineRepository;
import cat.institutmarianao.service.StockMovementService;

@Service
public class StockMovementServiceImpl implements StockMovementService {

	@Autowired
	private MedicineRepository medicineRepository;

	@Override
	public void processStockMovement(String medicineId, long quantity, int signe) {
		Medicine medicineById = medicineRepository.getMedicineById(medicineId);
		long signedQuantity = quantity * signe;
		if ((medicineById.getStockQuantity() + signedQuantity) < 0) {
			throw new IllegalArgumentException(
					"There is not enough units. The stock quantity is: " + medicineById.getStockQuantity());
		}
		medicineById.setStockQuantity(medicineById.getStockQuantity() + signedQuantity);
		medicineRepository.update(medicineById);
	}
}