import java.util.*;
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("임의의 정수 두 개를 입력해주세요 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.printf("%d * %d는 %d입니다.\n", x, y, x*y);
	}
	
}
