
public class Circle1 {
	int radius;
	String name;
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public Circle1() { //���� Ÿ���� ����, Ŭ���� �̸��� ����. >> ������
		radius = 1;
		name = "";
	}
	
	public Circle1(int r, String n) { //���� Ÿ���� ����, Ŭ���� �̸��� ����. >> ������
		radius = r;
		name = n;
	}
	
	public static void main(String[] args) {
		Circle1 pizza = new Circle1();
		pizza.name = "�Ұ�� ����";
		System.out.println(pizza.name+"�� ������ "+pizza.getArea()+"�Դϴ�.");
		
		Circle1 donut = new Circle1(10, "��Ų����");
		System.out.println(donut.name+"�� ������ "+donut.getArea()+"�Դϴ�.");
	}
}
