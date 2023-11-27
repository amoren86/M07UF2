package cat.institutmarianao.repository.impl;

import java.util.HashSet;
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
		ibuprofe.setCategory("Anti-inflamatori");
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

}
