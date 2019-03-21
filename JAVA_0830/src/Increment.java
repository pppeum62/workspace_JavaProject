
public class Increment {
	public static void main(String[] args) {
		int x = 0;
		System.out.println("메소드를 호출하기 전 x는 "+x+"입니다.");
		increment(x);
		System.out.println("메소드를 호출한 후의 x는 "+x+"입니다.");
	}
	
	public static void increment(int n) {
		System.out.println("메소드 시작할 때의 n은 "+n+"입니다.");
		n++;
		System.out.println("메소드 끝날 때의 n은 "+n+"입니다.");
	}
}
