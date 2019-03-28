import java.util.*;

public class UpDown {
	public static void main(String ar[]) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int rNumber = random.nextInt(100)+1;
	
		System.out.println("지금부터 Up & Down 게임을 시작합니다.");
		System.out.println("컴퓨터가 생각한 숫자를 맞춰주세요(1~100)");
		
		while(true) {
			System.out.print("숫자를 입력해주세요 >> ");
			int num = sc.nextInt();
			if(num > rNumber)
				System.out.println("Down!");
			else if(num < rNumber)
				System.out.println("Up!");
			else if(num == rNumber) {
				System.out.println("정답입니다!");
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			}
		}
	}
}