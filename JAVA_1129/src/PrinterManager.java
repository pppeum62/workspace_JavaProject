
public class PrinterManager {
	public static void main(String ar[]) {
		InkjetPrinter ip = new InkjetPrinter("SCX-6x45", "�Ｚ����", "��ũ��", 8, 2, 20);
		LaserPrinter lp = new LaserPrinter("LCX-5g24", "LG����", "������", 6, 3, 20);
		
		for(int i = 0; i < 3; i++) {
			//��ũ�� ������
			ip.print();
			System.out.print(ip.getType()+"������ >> ");
			System.out.print("��¸ż� : "+ip.numberOfPrinted+" ");
			if(ip.getNumberOfPaper() == 0) {
				System.out.println("������ �����մϴ�.");
			}
			else
				System.out.print("�������� : "+ip.getNumberOfPaper()+" ");
			if(ip.getAmountOfInk() == 0) {
				System.out.println("��ũ�� �����մϴ�.");
			}
			else
				System.out.println("��ũ�ܷ� : "+ip.getAmountOfInk());
			System.out.println();
			
			//������ ������
			lp.print();
			System.out.print(lp.getType()+"������ >> ");
			System.out.print("��¸ż� : "+lp.numberOfPrinted+" ");
			if(ip.getNumberOfPaper() == 0) {
				System.out.println("������ �����մϴ�.");
			}
			else
				System.out.print("�������� : "+lp.getNumberOfPaper()+" ");
			if(ip.getAmountOfInk() == 0) {
				System.out.println("��ʰ� �����մϴ�.");
			}
			else
				System.out.println("����ܷ� : "+ip.getAmountOfInk());
			System.out.println();
			
		}
	}
}