
public class PrinterManager {
	public static void main(String ar[]) {
		InkjetPrinter ip = new InkjetPrinter("SCX-6x45", "삼성전자", "잉크젯", 8, 2, 20);
		LaserPrinter lp = new LaserPrinter("LCX-5g24", "LG전자", "레이저", 6, 3, 20);
		
		for(int i = 0; i < 3; i++) {
			//잉크젯 프린터
			ip.print();
			System.out.print(ip.getType()+"프린터 >> ");
			System.out.print("출력매수 : "+ip.numberOfPrinted+" ");
			if(ip.getNumberOfPaper() == 0) {
				System.out.println("용지가 부족합니다.");
			}
			else
				System.out.print("남은용지 : "+ip.getNumberOfPaper()+" ");
			if(ip.getAmountOfInk() == 0) {
				System.out.println("잉크가 부족합니다.");
			}
			else
				System.out.println("잉크잔량 : "+ip.getAmountOfInk());
			System.out.println();
			
			//레이저 프린터
			lp.print();
			System.out.print(lp.getType()+"프린터 >> ");
			System.out.print("출력매수 : "+lp.numberOfPrinted+" ");
			if(ip.getNumberOfPaper() == 0) {
				System.out.println("용지가 부족합니다.");
			}
			else
				System.out.print("남은용지 : "+lp.getNumberOfPaper()+" ");
			if(ip.getAmountOfInk() == 0) {
				System.out.println("토너가 부족합니다.");
			}
			else
				System.out.println("토너잔량 : "+ip.getAmountOfInk());
			System.out.println();
			
		}
	}
}