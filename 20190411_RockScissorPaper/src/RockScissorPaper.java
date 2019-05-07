import java.util.*;

public class RockScissorPaper {
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
		
			System.out.println("You >> "+RSP[user]);
			System.out.println("Com >> "+RSP[com]);
		
			switch(user-com) {
			case -1: case 2:
				System.out.println("Com의 승리!");
				break;
			case 0:
				System.out.println("비겼습니다!");
				break;
			case 1: case -2:
				System.out.println("You의 승리!");
				break;
			}
		}
	}
}