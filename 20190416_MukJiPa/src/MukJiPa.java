import java.util.*;

public class MukJiPa {
	public static void main(String[] args) {
		boolean winPlayer = false;
		boolean winner = false;
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("지금부터 묵찌빠 게임을 시작합니다.");
		
		System.out.print("가위[1] 바위[2] 보[3] 종료[0] 입력 >> ");
		int user = sc.nextInt();
		int com = rand.nextInt(3);
		String[] RSP = {"가위", "바위", "보"};
		String[] MJP = {"찌", "묵", "빠"};
		
		user = user-1;
		
		System.out.println("You >> "+RSP[user]);
		System.out.println("Com >> "+RSP[com]);
		
		int result = compare(user, com);
		
		switch(result) {
		case -1:
			winPlayer = false;
			winner = true;
			break;
		case 0:
			if(winner == true) {
				if(winPlayer == true)
					System.out.println("You의 승리!");
				else
					System.out.println("Com의 승리!");
			}
			break;
		case 1:
			winPlayer = true;
			winner = true;
			break;
		}
	}
	
	private static int compare(int user, int com) {
		if ((user + 1) % 3 == com % 3) { // -1: 사용자가 짐
			return -1;
		} else if (user == com) { // 0: 비김
			return 0;
		} else { // 1: 사용자가 이김
			return 1;
		}
	}
}
