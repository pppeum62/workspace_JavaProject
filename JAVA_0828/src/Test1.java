import java.util.*;
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �Է����ּ��� : ");
		int i = sc.nextInt();
		
		switch(i) {
		case 1 : System.out.println("���� ���߽��ϴ�.");
		break;
		case 2 : case 3 : System.out.println("���߽��ϴ�.");
		break;
		case 4 : case 5 : case 6 : System.out.println("�����Դϴ�");
		break;
		default : System.out.println("����ϼ���");
		}
	}
}