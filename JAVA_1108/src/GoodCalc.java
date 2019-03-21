abstract class Claculator{
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}


public class GoodCalc extends Claculator{
	public int add(int a, int b) {
		return (a+b);
	}
	
	public int subtract(int a, int b) {
		if(a > b)
			return (a-b);
		else
			return (b-a);
	}
	
	public double average(int a[]) {
		int tot = 0;
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			tot += a[i];
			count++;
		}
		
		return (double)tot / count;
	
	}
	
	public static void main(String ar[]) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] {2, 3, 4}));
		
	}
}
