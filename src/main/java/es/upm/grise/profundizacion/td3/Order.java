package es.upm.grise.profundizacion.td3;

public class Order {
	
	int id;
	double amount;

	public Order(int id, double amount) {
		this.id = id;
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

}
