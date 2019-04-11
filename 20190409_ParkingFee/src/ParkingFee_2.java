import java.util.*;

public class ParkingFee_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("주차시간을 입력해주세요(분 단위 입력) >> ");
			int time = sc.nextInt();
			
			int fee = 1500;
			
			if(time == 0) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			
			if(time > 1440) {
				System.out.println("주차시간은 24시간을 넘을 수 없습니다.");
				continue;
			}
				
			else if (time > 30){
				int num = time / 10; //십의 자리
				int num2 = time % 10; //일의 자리
				fee += (num-3) * 1000;
				if(num2 >= 1)
					fee += 1000;
				if(fee >= 25000)
					fee = 25000;
			}
			
			System.out.println("총 주차요금은 "+fee+"원입니다.");
		}
	}
}