public class ToGo extends Order{
	
	public ToGo(String orderName, int time) {
		super(orderName, time);
	}

	public String getString() {
		return "Order #" + getOrder() + " (To Go): " + getName();
	}
	
	public int getTime() {
		return super.getTime() + 5;
	}
}