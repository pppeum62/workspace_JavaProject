import java.util.*;
public class Test02 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int tot = 0;
		
		do {
			System.out.print("양의 정수를 입력하세요 : ");
			n = sc.nextInt();
			
				if(n % 2 == 0) {
					tot += n;
				}
		} while(n > 0);
		
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 : "+tot);
		
	}
}
