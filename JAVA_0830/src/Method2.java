
public class Method2 {
	public static void main(String ar[]) {
		
		int s1 = sum(1,10);
		System.out.println("합(1~10) : "+ s1);
		int s2 = sum(10, 100);
		System.out.println("합(10~100 : " + s2);
		int s3 = sum(100,1000);
		System.out.println("합(100~1000) : "+ s3);
		
		/*System.out.println("합(1~10) : " + sum(1,10));
		System.out.println("합(10~100) : " + sum(10, 100));
		System.out.println("합(100~1000) : " + sum(100, 1000));*/
	}
	
	public static int sum(int i1, int i2) {
		int sum = 0;
		for(int i = i1; i <= i2; i++)
			sum += i;
		return sum;
	}
	
}