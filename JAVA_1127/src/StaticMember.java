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
		System.out.println("백만원은 "+CurrencyConventer.toDollar(1000000)+ "달러입니다.");
		System.out.println("백달러는 "+CurrencyConventer.toKWR(100)+"원입니다.");
	}

}
