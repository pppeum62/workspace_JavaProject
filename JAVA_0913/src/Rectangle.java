import java.util.*;

public class Rectangle {
	int width;
	int height;
	public int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rac = new Rectangle();
		System.out.print("사각형이 너비를 입력해주세요 >> ");
		rac.width = sc.nextInt();
		System.out.print("사각형의 높이를 입력해주세요 >> ");
		rac.height = sc.nextInt();
		
		System.out.println("사각형의 면적은 "+rac.getArea()+"입니다.");
	}
}
