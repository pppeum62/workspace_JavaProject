
public class Increment {
	public static void main(String[] args) {
		int x = 0;
		System.out.println("�޼ҵ带 ȣ���ϱ� �� x�� "+x+"�Դϴ�.");
		increment(x);
		System.out.println("�޼ҵ带 ȣ���� ���� x�� "+x+"�Դϴ�.");
	}
	
	public static void increment(int n) {
		System.out.println("�޼ҵ� ������ ���� n�� "+n+"�Դϴ�.");
		n++;
		System.out.println("�޼ҵ� ���� ���� n�� "+n+"�Դϴ�.");
	}
}
