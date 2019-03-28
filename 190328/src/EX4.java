
public class EX4 {
	public static void main(String ar[]) {
		char ch = 'A';
		String strData1 = "A";
		String strData2 = String.valueOf(ch);
		
		if(strData1.equals(strData2))
			System.out.println("strData1과 strData2의 내용은 일치합니다.");
		else
			System.out.println("strData1과 strData2의 내용은 일치하지 않습니다.");
	}

}
