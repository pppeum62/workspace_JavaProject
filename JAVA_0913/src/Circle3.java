//�⺻ �����ڰ� �ڵ����� �������� �ʴ� ���
// Ŭ������ �ϳ��� �����ڰ� ������� �ִ� ��쿡�� ����Ʈ �����ڰ� �ڵ����� �������� ����, ���� ������ �Ѵ�.
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
		System.out.println("������ ������ "+pizza.getArea()+"�Դϴ�.");
		
		Circle3 donut = new Circle3();
		System.out.println(donut.getArea());
	}
}
