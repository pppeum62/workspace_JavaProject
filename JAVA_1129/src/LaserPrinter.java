
public class LaserPrinter extends Printer{
	private int Toner;
	
	public LaserPrinter(String modelName, String manufacturer, String type,
			int numberOfPaper, int numberOfPrinted, int Toner) {
		super(modelName, manufacturer, type, numberOfPaper, numberOfPrinted);
		this.Toner = Toner;
	}
	
	public String print() {
		return "레이저 프린터 출력";
	}
	
	public void setToner(int Toner) {
		this.Toner = Toner;
	}
	
	public int getToner() {
		this.Toner--;
		if(this.Toner <= 0)
			return 0;
		else
			return this.Toner;
	}
	
}
