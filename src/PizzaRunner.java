
public class PizzaRunner {
	public static void main(String[] args) {
		Pizza p1 = new Pizza(8, "pepperoni");
		p1.eatSclice();
		System.out.println(p1.getSlices());
		p1.yum();
	}
}
