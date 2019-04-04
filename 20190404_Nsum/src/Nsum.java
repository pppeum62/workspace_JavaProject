import java.util.*;

public class Nsum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수를 입력해주세요 >> ");
		String num = sc.nextLine();
		int sum = 0;
		
		int len = num.length();
		for(int i = 0; i < len; i++) {
			char n = num.charAt(i);
			sum += n - '0';
		}
		
		System.out.println("자연수 각 자릿수의 합은 >> "+sum);
	}
}