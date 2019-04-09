/*분을 입력 받아
 * 최초 30분은 2000원, 10분당 1000원
 * 주차요금을 출력하자
 */
import java.util.*;

public class ParkingFee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주차시간을 입력해주세요 >> ");
		int time = sc.nextInt();
		
		int fee = 0;
		
		if(0 <= time && time <= 30)
			fee = 2000;
		else {
			int num = time / 10; //십의 자리
			int num2 = time % 10; //일의 자리
			fee = (num-1) * 1000;
			if(num2 >= 1)
				fee += 1000;
		}
		
		System.out.println("총 주차요금은 "+fee+"원입니다.");
	}
}
