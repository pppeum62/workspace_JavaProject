
public class ReturnDemo {
	public static void main(String ar[]) {
		printScore(99);
		printScore(200);
		printScore(95);
	}
	
	public static void printScore(int score){
		if(score < 0 || score > 100) {
			System.out.println("�߸��� ���� : "+ score);
			return;
		}
		
		System.out.println(score + "���Դϴ�!");
	}
}
