import java.util.*;

public class UpDown {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = (int)(Math.random()*100) + 1;
		int user;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("숫자 입력(1-100) >> ");
			user = sc.nextInt();
			
			if(user > number)
				System.out.println("너무 큽니다.("+i+"회)");
			else if(user < number)
				System.out.println("너무 작습니다.("+i+"회)");
			else if(user == number) {
				System.out.println("***** 축하합니다 *****");
				System.exit(0);
			}	
		}
		
		System.out.println("기회가 끝났습니다.");
	}
}
