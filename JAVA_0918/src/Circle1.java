
public class Circle1 {
	int radius;
	void set(int radius) {
		this.radius = radius;
	}
	double getArea() {
		return 3.14 * radius * radius;
	}
	
	public Circle1(int r) {
		radius = r;
	}
	
	public Circle1() { }
	
	public static void main(String ar[]) {
		Circle1 pizza = new Circle1(15);
		System.out.println("15인치 피자"+pizza.getArea());
		
		Circle1 pizza1 = new Circle1();
	}
}
