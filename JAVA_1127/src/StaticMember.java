class CurrencyConventer{
	private static double rate;
	public static double toDollar(double won) {
		return won / rate;
	}
	public static double toKWR(double dollar) {
		return dollar * rate;
	}
	public static void setRate(double r) {
		rate = r;
	}
}
public class StaticMember {
	public static void main(String ar[]) {
		CurrencyConventer.setRate(1121);
		System.out.println("�鸸���� "+CurrencyConventer.toDollar(1000000)+ "�޷��Դϴ�.");
		System.out.println("��޷��� "+CurrencyConventer.toKWR(100)+"���Դϴ�.");
	}

}
