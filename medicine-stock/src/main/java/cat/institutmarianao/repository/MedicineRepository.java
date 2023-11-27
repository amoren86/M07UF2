package cat.institutmarianao.repository;

import java.util.Set;

import cat.institutmarianao.domain.Medicine;

public interface MedicineRepository {
	Set<Medicine> getAllMedicines();
}
