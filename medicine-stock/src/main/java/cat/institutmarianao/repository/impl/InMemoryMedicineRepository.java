package cat.institutmarianao.repository.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import cat.institutmarianao.domain.Medicine;
import cat.institutmarianao.repository.MedicineRepository;

@Repository
public class InMemoryMedicineRepository implements MedicineRepository {
	private Set<Medicine> medicines = new HashSet<>();

	public InMemoryMedicineRepository() {
		Medicine ibuprofe = new Medicine("M010", "Ibuprofé", 2);
		ibuprofe.setDescription("Ibuprofé de 600mg");
		ibuprofe.setCategory("Anti−inflamatori");
		ibuprofe.setProducer("Cinfa");
		ibuprofe.setStockQuantity(214);

		Medicine paracetamol = new Medicine("M020", "Paracetamol", 2.6);
		paracetamol.setDescription("Paracetamol 1g");
		paracetamol.setCategory("Analgèsic");
		paracetamol.setProducer("Ferrer");
		paracetamol.setStockQuantity(56);

		Medicine acacetilsalicilico = new Medicine("M030", "Ac Acetil Salicílic", 2.6);
		acacetilsalicilico.setDescription("Ac Acetil Salicílic");
		acacetilsalicilico.setCategory("Analgèsic");
		acacetilsalicilico.setProducer("Bayer");
		acacetilsalicilico.setStockQuantity(15);
		medicines.add(ibuprofe);
		medicines.add(paracetamol);
		medicines.add(acacetilsalicilico);
	}

	@Override
	public Set<Medicine> getAllMedicines() {
		return medicines;
	}

	@Override
	public Medicine getMedicineById(String medicineId) {
		Medicine medicineById = null;
		for (Medicine medicine : medicines) {
			if (medicine != null && medicine.getMedicineId() != null && medicine.getMedicineId().equals(medicineId)) {
				medicineById = medicine;
				break;
			}
		}
		if (medicineById == null) {
			throw new IllegalArgumentException("No s’han trobat medicines amb el codi: " + medicineId);
		}
		return medicineById;
	}

	@Override
	public Set<Medicine> getMedicinesByCategory(String category) {
		Set<Medicine> medicinesByCategory = new HashSet<>();
		for (Medicine medicine : medicines) {
			if (category.equalsIgnoreCase(medicine.getCategory())) {
				medicinesByCategory.add(medicine);
			}
		}
		return medicinesByCategory;
	}

	@Override
	public Set<Medicine> getMedicinesByFilter(Map<String, List<String>> filterParams) {
		Set<Medicine> medicinesByProducer = new HashSet<>();
		Set<Medicine> medicinesInStockRange = new HashSet<>();

		Set<String> criterias = filterParams.keySet();

		for (Medicine medicine : medicines) {
			if (criterias.contains("producer")) {
				for (String producerName : filterParams.get("producer")) {
					if (producerName.equalsIgnoreCase(medicine.getProducer())) {
						medicinesByProducer.add(medicine);
					}
				}
			}
			if (criterias.contains("stock")) {
				long minStock = Long.parseLong(filterParams.get("stock").get(0));
				long maxStock = Long.parseLong(filterParams.get("stock").get(1));
				if ((medicine.getStockQuantity() >= minStock) && (medicine.getStockQuantity() <= maxStock)) {
					medicinesInStockRange.add(medicine);
				}
			}
		}
		medicinesInStockRange.retainAll(medicinesByProducer);
		return medicinesInStockRange;
	}

	@Override
	public void update(Medicine medicineById) {
		// Do nothing, because its in memory
	}

	@Override
	public void addMedicine(Medicine medicine) {
		medicines.add(medicine);
	}
}
