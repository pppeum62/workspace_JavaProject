import java.util.*;
public class Test02 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int tot = 0;
		
		do {
			System.out.print("���� ������ �Է��ϼ��� : ");
			n = sc.nextInt();
			
				if(n % 2 == 0) {
					tot += n;
				}
		} while(n > 0);
		
		System.out.println("�Է��� ���� ���� �߿��� ¦���� ���� : "+tot);
		
	}
}
