
public class NamedCircle extends Circle {
	String name;
	
	public NamedCircle(int radius, String name) {
		super(radius);
		this.name = name;
	}
	
	public void show() {
		System.out.print(this.name+", ¹ÝÁö¸§ = "+getRadius());
	}
	public static void main(String ar[]) {
		NamedCircle w = new NamedCircle(5, "Waffle");
		w.show();
	}
}