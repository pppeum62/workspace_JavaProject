import java.util.*;

public class Echo {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문장을 입력해주세요 (종료시 exit) >> ");
			String echo = sc.nextLine();
			if(echo.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			System.out.println(echo);
		}
		
	}
}
