import java.util.*;

public class UpDown_com_Upgrade {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("지금부터 Up&Down 게임을 시작합니다.");
		System.out.println("1부터 100까지 숫자 중 하나를 생각해주세요.");
		System.out.println("Com : 제가 맞춰볼게요.");
		System.out.print("게임을 시작하려면 아무 키나 입력해주세요 >> ");
		String start = sc.nextLine();
		int max = 100, min = 1;
		int com = 50;
		int user;
		while(true) {
			System.out.println("Com : 당신이 생각한 숫자는 "+com+"입니다. 맞죠?");
			System.out.print("맞으면 [1] 틀리면 Up[2] Down[3]을 입력해주세요 >> ");
			user = sc.nextInt();
			switch(user) {
			case 1:
				System.out.println("Com : 제가 맞췄네요!");
				System.out.print("프로그램을 종료합니다.");
				System.exit(0);
				break;
			case 2:
				min = com;
				com = (max + com) / 2 + 1;
				//max = (max + com) / 2 + 1;
				//max = com;
				break;
			case 3:
				max = com;
				com = com / 2 - 1;
				//min = com;
				//min = com / 2 - 1;
				break;
			}
		}
	}
}