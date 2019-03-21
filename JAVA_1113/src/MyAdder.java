
public class MyAdder implements AdderInterface {
	
	public int add(int x, int y) {
		return (x+y);
	}
	
	public int add(int n) {
		int tot = 0;
		for(int i = 1; i <= n; i++) {
			tot += i;
		}
		
		return tot;
	}
	public static void main(String ar[]) {
		MyAdder adder = new MyAdder();
		System.out.println(adder.add(5, 10));
		System.out.println(adder.add(10));
	}
}
