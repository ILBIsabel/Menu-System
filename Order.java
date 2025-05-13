public class Order {
	private int orderNumber;
	private String orderName;
	private int time;
	private static int orderCount = 0;
	
	public Order(String orderName, int time) {
		this.orderName = orderName;
		this.time = time;
		this.orderNumber = ++orderCount;
	}
	
	public String getString() {
		return "ORDER";
	}
	
	public int getOrder() {
		return orderNumber;
	}
	
	public int getTime() {
		return time;
	}
	
	public String getName() {
		return orderName;
	}
}
