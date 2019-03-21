class Point1{
	int x, y;
	public Point1(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public boolean equals(Object ob) {
		Point1 p = (Point1) ob;
		if(x == p.x && y == p.y)
			return true;
		else
			return false;
	}
}
public class EqualsEx {
	public static void main(String[] args) {
		Point1 a = new Point1(2, 3);
		Point1 b = new Point1(2, 3);
		Point1 c = new Point1(3, 4);
		if(a==b)
			System.out.println("a==b");
		if(a.equals(b))
			System.out.println("a is equals b");
	}

}
