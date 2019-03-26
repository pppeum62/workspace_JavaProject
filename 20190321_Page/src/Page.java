import java.util.*;

public class Page {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		
		String ex = "exit";
		
		while(true) {
			int page = 0;
			System.out.println("전체 페이지를 입력해주세요(정수로 쓰세요 / 종료시 exit 입력) >> ");
			String p = sc.nextLine();
			
			if(p.equals(ex)) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
			
			page = Integer.parseInt(p);
			
			int re = 0;
			re = page / 7;
			
			if(page%7!=0)
				re++;
		
			System.out.println(re+"페이지가 필요합니다.");
		}
		
		
	}
}
