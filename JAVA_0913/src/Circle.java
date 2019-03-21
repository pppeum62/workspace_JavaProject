
public class Circle {
	int radius;
	String name;
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String ar[]) {
		Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "자바피자";
		
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area+"입니다.");
		
		Circle tray = new Circle();
		tray.radius = 5;
		tray.name = "자바쟁반";
		
		double area2 = tray.getArea();
		System.out.println(tray.name+"의 면적는 "+area2+"입니다.");
	}

}
