import java.util.*;

class Seat{
	String seatS[]= {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
	String seatA[] = new String[10];
	String seatB[] = new String[10];
	
	public void first() {
		for(int i = 0; i < 10; i++) {
			seatS[i] = "---";
			seatA[i] = "---";
			seatB[i] = "---";
		}
	}
	
	String name;
	int num;
	public void showSeat() {}
	public void seatSet(String name, int num) {}
	
}

class Seat_s extends Seat{
	
	public Seat_s(String name, int num) {
		this.name = name;
		this.num = num;
		
		seatS[num-1] = name;
	}
	
	public void seatSet(String name, int num) {
		this.name = name;
		this.num = num;
		
		seatS[num-1] = name;
	}
	
	public Seat_s() {
	}

	public void showSeat() {
		System.out.print("S >> ");
		for(int i = 0; i < seatS.length; i++) {
			System.out.print(seatS[i]+" ");
		}
		System.out.println();
	}
}

public class Reserve {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		Seat s = new Seat();
		
		while(true) {
			System.out.print("����[1], ��ȸ[2], ���[3], ����[4] >> ");
			int ch1 = sc.nextInt();
			switch(ch1) {
			case 1 :
				System.out.print("�¼����� S[1], A[2], B[3] >> ");
				int ch2 = sc.nextInt();
				switch(ch2) {
				case 1 :
					s.showSeat();
					System.out.print("�̸� >> ");
					String name = sc.next();
					System.out.print("��ȣ >> ");
					int num = sc.nextInt();
					s.seatSet(name, num);
					s.showSeat();
					break;
				case 2 :
					s.showSeat();
					break;
				case 3 :
					break;
				}
				break;
			case 2 :
				break;
			case 3 :
				break;
			case 4 : 
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);	
			}
		}
	}
}
