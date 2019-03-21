
public class LocalVariable {
	public static void main(String[] args) {
		int a = 0;
		double b;
		
		//System.out.println(b); - 초기화 하지 않고는 사용할 수 없다.
		//System.out.println(a+c); - c 변수가 선언되지 않았다.
		
		int c = 0;
		
		//public double d = 0.0; //지역변수는 public으로 지정할 수 없다.
		
		for(int e = 0; e < 10; e++) {
			//int a = 1; 4행에서 선언된 지역변수 이름과 같아서 에러. 블록이 달라도 같은 이름으로는 다시 선언할 수 없다.
		}
	}
}
