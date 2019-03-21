class Ex{
	private int x, y;
	public Ex(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "Ex : "+ x + y;
	}
}
public class ObjectEx {
	public static void main(String[] args) {
		Ex e = new Ex(2, 4);
		System.out.println(e.getClass().getName());
		System.out.println(e.toString());
	}
}
