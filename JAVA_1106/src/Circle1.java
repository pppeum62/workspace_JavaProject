class Shape2{
	protected String name;
	public void paint() {
		draw();
	}
	
	public void draw() {
		System.out.println("Shape");
	}
}
public class Circle1 extends Shape2 {
	public static void main(String[] args) {
		Shape2 b = new Circle1();
		b.paint();
	}
	
	public void draw() {
		System.out.println("Circle");
	}
}