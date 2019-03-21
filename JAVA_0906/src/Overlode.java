
public class Overlode {
	
	public static void main(String ar[]) {
		int i1 = 3, i2 = 7, i3 = 10;
		double d1 = 7.0, d2 = 3.0;
		
		System.out.println(max(i1,i2));
		System.out.println(max(d1,d2));
		System.out.println(max(i1,i2,i3));
	}
	
	public static int max(int n1, int n2) {
		int result = n1 > n2 ? n1 : n2;
		return result;
		
	}
	
	public static double max(double n1, double n2) {
		double result = n1 > n2 ? n1 : n2;
		return result;
		
	}
	
	public static int max(int n1, int n2, int n3) {
		int result = n1 > n2 ? n1 : n2 > n3 ? n2 : n3;
		return result;
	}
}
