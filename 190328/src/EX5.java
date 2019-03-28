
public class EX5 {
	public static void main(String ar[]) {
		String strData1 = " I LOVE MIRIM MEISTER ";
		String strData2 = strData1.trim();
		
		System.out.println("strData1 >>"+strData1);
		System.out.println("strData2 >>"+strData2);
		
		if(strData1.equals(strData2))
			System.out.println("strData1과 strData2의 내용은 일치합니다.");
		else
			System.out.println("strData1과 strData2의 내용은 일치하지 않습니다.");
	}

}
