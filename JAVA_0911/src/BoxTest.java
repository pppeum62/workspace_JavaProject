class Box{
	int width;
	int length;
	int height;
}

public class BoxTest {
	public static void main(String ar[]) {
		Box B = new Box();
		B.width = 20;
		B.length = 20;
		B.height = 20;
		
		System.out.println("박스의 가로는 "+B.width+"이고, 세로는 "+B.length+"이고, 높이는 "+B.height+"입니다.");
		
	}
}
