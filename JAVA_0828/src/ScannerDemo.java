import java.util.*;
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ���� �� ���� �Է����ּ��� : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.printf("%d * %d�� %d�Դϴ�.\n", x, y, x*y);
	}
	
}
