public class DineIn extends Order {
	
	public DineIn(String orderName, int time) {
		super(orderName, time);
	}
	
	public String getString() {
		return "Order #" + getOrder() + " (Dine In): " + getName();
	}
	
}