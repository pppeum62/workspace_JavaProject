
public class EX10 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("java programming");
		StringBuffer sb2 = sb1.replace(0, 4, "JAVA");
		
		System.out.println(sb2);
	}
}