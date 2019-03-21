
public class Interface {
	public static void main(String ar[]) {
		SamsungPhone phone = new SamsungPhone();
		PhoneInterface phone1 = new LgPhone();
		
		phone.sendCall();
		phone.receiveCall();
		
		phone1.sendCall();
		phone1.receiveCall();
	}
}
