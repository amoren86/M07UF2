package cat.institutmarianao.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.institutmarianao.domain.Medicine;
import cat.institutmarianao.repository.MedicineRepository;
import cat.institutmarianao.service.MedicineService;

@Service
public class MedicineServiceImpl implements MedicineService {
	@Autowired
	private MedicineRepository medicineRepository;

	@Override
	public Set<Medicine> getAllMedicines() {
		return medicineRepository.getAllMedicines();
	}

	@Override
	public Medicine getMedicineById(String medicineId) {
		return medicineRepository.getMedicineById(medicineId);
	}

	@Override
	public Set<Medicine> getMedicinesByCategory(String category) {
		return medicineRepository.getMedicinesByCategory(category);
	}

	@Override
	public Set<Medicine> getMedicinesByFilter(Map<String, List<String>> filterParams) {
		return medicineRepository.getMedicinesByFilter(filterParams);
	}

	@Override
	public void addMedicine(Medicine medicine) {
		medicineRepository.addMedicine(medicine);
	}
}
