import java.util.*;

public class Baseball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		String c = makeComputer();
		
		while(true) {
			String p = sc.nextLine();
		
			boolean isEnd = play(p, c);
			if(isEnd == true) {
				System.out.println("Hit");
				break;
			}
		}
		
		/*정답을 만들자
		 * 1~9까지 랜덤 숫자 3번 뽑기, 단 중복 없이
		 * 
		 * 무한반복
		 * 1~9까지 세자리 숫자 입력하기
		 * strike, ball 구하기
		 * 	for i 사용자 인덱스 들고
		 * 		for j 컴퓨터 인덱스 들고
		 * 			if p[i] == c[j]
		 * 				if i == j, strike++;
		 * 				else, ball++;
		 * p, strike, ball 츨력하자
		 * strike == 입력한 문자열 길이만큼 나오면 Hit
		 */
	}

	private static String makeComputer() {
		StringBuffer buffer = new StringBuffer();
		Random rand = new Random();
		
		for(int i = 0; i < 3; ) {
			int r = rand.nextInt(9 - 1 + 1) + 1;
			String rString = String.valueOf(r);
			
			if(!buffer.toString().contains(rString)) {
				buffer.append(rString);
				i++;
			}
		}
		
		return buffer.toString();
	}

	private static boolean play(String p, String c) {
		int strike = 0;
		int ball = 0;
		
		for(int i = 0; i < p.length(); i++) {
			for(int j = 0; j < c.length(); j++) {
				if(p.charAt(i) == c.charAt(j)) {
					if(i == j)
						strike++;
					else
						ball++;
				}
			}
		}
		
		System.out.println(p + "\tstrike: "+strike+"\tball: "+ball);
		
		if(strike == 3)
			return true;
		
		return false;
	}
}
