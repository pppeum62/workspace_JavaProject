//기본 생성자가 자동으로 생성되지 않는 경우
// 클래스에 하나라도 생성자가 만들어져 있는 경우에는 디폴트 생성자가 자동으로 생성되지 않음, 직접 만들어야 한다.
public class Circle3 {
	int radius;
	
	void set(int r) {
		radius = r;
		}
	
	double getArea() {
		return 3.14 * radius * radius;
	}
	
	public Circle3(int r) {
		radius = r;
	}
	
	public Circle3() {
		
	}
	
	public static void main(String[] args) {
		Circle3 pizza = new Circle3(10);
		System.out.println("피자의 면적은 "+pizza.getArea()+"입니다.");
		
		Circle3 donut = new Circle3();
		System.out.println(donut.getArea());
	}
}
