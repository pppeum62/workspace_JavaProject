
public class Game_369 {
	public static void main(String[] args) {
		for(int i = 1; i < 100; i++) {
			if(i < 10)
				if(i%3==0)
					System.out.println("짝");
				else if(i==5)
					System.out.println("뿌숑!");
				else
					System.out.println(i);
			
			else if(i%5==0)
				System.out.println("뿌숑!");
			else if(i/10%3==0) {
				System.out.print("짝");
				if(i%10!=0 && i%10%3==0)
					System.out.println("짝");
				else
					System.out.println();
			}
			
			else if(i%10!=0 && i%10%3==0)
				System.out.println("짝");
			else
				System.out.println(i);
		}
	}
}