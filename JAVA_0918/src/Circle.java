
public class Circle {
	int radius;
	void set(int r) {
		
	}
	double getArea() {
		return 3.14 * radius * radius;
	}
	public Circle() { }
	
	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.set(5);
		System.out.println(pizza.getArea());
	}
}
