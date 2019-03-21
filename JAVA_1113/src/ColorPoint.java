
public class ColorPoint extends Point{
	
	String name;
	
	public ColorPoint(int x, int y, String name) {
		super(x, y);
		this.name = name;
	}
	
	public void setPoint(int x, int y) {
		this.move(x, y);
	}
	
	public void setColor(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println(this.name+"»öÀ¸·Î ("+this.getX()+", "+this.getY()+")");
	}
	
	public static void main(String ar[]) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setPoint(10, 20);
		cp.setColor("GREEN");
		cp.show();
	}
}
