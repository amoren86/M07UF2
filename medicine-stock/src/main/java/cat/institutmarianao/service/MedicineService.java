package cat.institutmarianao.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import cat.institutmarianao.domain.Medicine;

public interface MedicineService {

	Set<Medicine> getAllMedicines();

	Medicine getMedicineById(String medicineId);

	Set<Medicine> getMedicinesByCategory(String category);

	Set<Medicine> getMedicinesByFilter(Map<String, List<String>> filterParams);

	void addMedicine(Medicine medicine);
}
