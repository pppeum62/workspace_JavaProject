
public class Circle1 {
	int radius;
	String name;
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public Circle1() { //리턴 타입이 없고, 클래스 이름이 같다. >> 생성자
		radius = 1;
		name = "";
	}
	
	public Circle1(int r, String n) { //리턴 타입이 없고, 클래스 이름이 같다. >> 생성자
		radius = r;
		name = n;
	}
	
	public static void main(String[] args) {
		Circle1 pizza = new Circle1();
		pizza.name = "불고기 피자";
		System.out.println(pizza.name+"의 면적은 "+pizza.getArea()+"입니다.");
		
		Circle1 donut = new Circle1(10, "던킨도넛");
		System.out.println(donut.name+"의 면적은 "+donut.getArea()+"입니다.");
	}
}
