package cat.institutmarianao.domain;

import java.util.Objects;

public class Medicine {
	private String medicineId;
	private String name;
	private double price;
	private String description;
	private String producer;
	private String category;
	private long stockQuantity;
	private long stockInOrder;
	private boolean active;

	public Medicine() {
		super();
	}

	public Medicine(String medicineId, String name, double price) {
		super();
		this.medicineId = medicineId;
		this.name = name;
		this.price = price;
	}

	public String getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(String medicineId) {
		this.medicineId = medicineId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(long stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public long getStockInOrder() {
		return stockInOrder;
	}

	public void setStockInOrder(long stockInOrder) {
		this.stockInOrder = stockInOrder;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Medicine medicine)) {
			return false;
		}
		return Objects.equals(medicineId, medicine.medicineId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(medicineId);
	}

	@Override
	public String toString() {
		return "medicine [code=" + medicineId + ", name=" + name + "]";
	}
}
