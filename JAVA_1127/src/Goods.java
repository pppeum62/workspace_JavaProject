import java.util.*;

public class Goods {
	private String name;
	private int price;
	private int num1, num2;
	
	public Goods() {}
	
	public Goods(String name, int price, int num1, int num2) {
		this.name = name;
		this.price = price;
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int getNum1() {
		return this.num1;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int getNum2() {
		return this.num2;
	}
	
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		Goods goods[] = new Goods[3];
		
		for(int i = 0; i < goods.length; i++) {
			
			//System.out.print("��ǰ �̸��� �Է��ϼ��� >> ");
			String name =sc.next();
			//System.out.print("��ǰ ������ �Է��ϼ��� >> ");
			int price = sc.nextInt();
			//System.out.print("���� ������ �Է��ϼ��� >> ");
			int num1 = sc.nextInt();
			//System.out.print("�ȸ� ������ �Է��ϼ��� >> ");
			int num2 = sc.nextInt();
			goods[i] = new Goods(name, price, num1, num2);
			
		}
		
		for(int i = 0; i < goods.length; i++) {
			System.out.println("��ǰ �̸� : "+goods[i].getName());
			System.out.println("��ǰ ���� : "+goods[i].getPrice());
			System.out.println("���� ���� : "+goods[i].getNum1());
			System.out.println("�ȸ� ���� : "+goods[i].getNum2());
			System.out.println();
		}
	}
}