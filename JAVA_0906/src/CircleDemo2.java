class Circle1 {
	private double radius; //��������� �ܺηκ��� ���н�Ų��.
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double r) {
		radius = r;
	}
	
	void show(double x, double y) {
		System.out.printf("������ : %.1, ���� : %.1f\n",x,y);
	}
	
	double fineArea() {
		return 3.14 * radius * radius;
	}
}

public class CircleDemo2 {
	public static void main(String[] args) {
		Circle1 myCircle = new Circle1();
		myCircle.setRadius(10.0);
		
		System.out.println(myCircle.getRadius());
		myCircle.show(myCircle.getRadius(), myCircle.fineArea());
	}
}
