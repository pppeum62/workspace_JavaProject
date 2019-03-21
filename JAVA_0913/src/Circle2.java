
public class Circle2 {
	int radius;
	void set(int r) {
		radius = r;
	}
	
	double getArea() {
		return 3.14 * radius * radius;
	}
	
	//public Circle2(){ } >> 디폴트 생성자 : 지금은 코딩을 하지 않아도 자동 생성되며, 오류도 나지 않음.
	
	public static void main(String[] args) {
		Circle2 pizza = new Circle2();
		pizza.set(5);
		System.out.println(pizza.getArea());
	}
}
