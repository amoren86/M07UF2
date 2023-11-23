package cat.institutmarianao.service;

public interface StockMovementService {

	void processStockMovement(String medicineId, long quantity, int signe);

}
