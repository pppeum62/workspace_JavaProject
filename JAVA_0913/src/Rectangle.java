import java.util.*;

public class Rectangle {
	int width;
	int height;
	public int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rac = new Rectangle();
		System.out.print("�簢���� �ʺ� �Է����ּ��� >> ");
		rac.width = sc.nextInt();
		System.out.print("�簢���� ���̸� �Է����ּ��� >> ");
		rac.height = sc.nextInt();
		
		System.out.println("�簢���� ������ "+rac.getArea()+"�Դϴ�.");
	}
}
