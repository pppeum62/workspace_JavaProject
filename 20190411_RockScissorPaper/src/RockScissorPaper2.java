import java.util.Random;
import java.util.Scanner;

public class RockScissorPaper2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("지금부터 가위바위보 게임을 시작합니다.");
		while(true) {
			System.out.print("가위[1] 바위[2] 보[3] 종료[0] 입력 >> ");
			int user = sc.nextInt();
			int com = rand.nextInt(3);
		
			if(user == 0) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		
			String[] RSP = {"가위", "바위", "보"};
		
			user = user - 1;
			
			int result = compare(user, com);
		
			System.out.println("You >> "+RSP[user]);
			System.out.println("Com >> "+RSP[com]);
		
			switch(result) {
			case -1:
				System.out.println("Com의 승리!");
				break;
			case 0:
				System.out.println("비겼습니다!");
				break;
			case 1:
				System.out.println("You의 승리!");
				break;
			}
		}
	}

	private static int compare(int user, int com) {
		if ((user + 1) % 3 == com % 3) {
			// -1: 사용자가 짐
			return -1;
		} else if (user == com) {
			// 0: 비김
			return 0;
		} else {
			// 1: 사용자가 이김
			return 1;
		}
	}
}