class Phone {
	String model;
	int value;
	
	void print() {
		System.out.println("기종 : " + model + "\n" + "가격 : " + value + "만 원");
	}
}

public class PhoneDemo {
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		Phone yourPhone = new Phone();
		
		myPhone.model = "아이폰8";
		myPhone.value = 126;
		myPhone.print();
		
		yourPhone.model = "아이폰X";
		yourPhone.value = 154;
		yourPhone.print();
	}
}
