import java.util.*;

public class NumberToWeekday {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] weekdays = {"월","화","수","목","금","토","일"};
		
		System.out.print("숫자 하나를 입력해주세요(1-7) >> ");
		int weekday = sc.nextInt();
		System.out.println(weekdays[weekday-1]+"요일");
		
		/*switch(weekday) {
		case 1: System.out.println("월요일"); break;
		case 2: System.out.println("화요일"); break;
		case 3: System.out.println("수요일"); break;
		case 4: System.out.println("목요일"); break;
		case 5: System.out.println("금요일"); break;
		case 6: System.out.println("토요일"); break;
		case 7: System.out.println("일요일"); break;
		default: System.out.println("1부터 7까지의 숫자만 입력해주세요.");
		}*/
	}
}
