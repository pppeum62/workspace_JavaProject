import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		int start = 0;
		int end = 99;
		Random rand = new Random();
		int randomNumber = rand.nextInt(end+1-start)+start;
		System.out.println(randomNumber);
	}
}
