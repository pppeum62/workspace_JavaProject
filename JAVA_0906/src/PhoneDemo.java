class Phone {
	String model;
	int value;
	
	void print() {
		System.out.println("���� : " + model + "\n" + "���� : " + value + "�� ��");
	}
}

public class PhoneDemo {
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		Phone yourPhone = new Phone();
		
		myPhone.model = "������8";
		myPhone.value = 126;
		myPhone.print();
		
		yourPhone.model = "������X";
		yourPhone.value = 154;
		yourPhone.print();
	}
}
