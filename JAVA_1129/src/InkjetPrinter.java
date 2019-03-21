
public class InkjetPrinter extends Printer{
	static final int amountOfInkToPrint = 5;
	private int amountOfInk;
	
	public InkjetPrinter(String modelName, String manufacturer, String type,
			int numberOfPaper, int numberOfPrinted, int amountOfInk) {
		super(modelName, manufacturer, type, numberOfPaper, numberOfPrinted);
		this.amountOfInk = amountOfInk;
	}
	
	public void setAmountOfInk(int amountOfInk) {
		this.amountOfInk = amountOfInk;
	}
	
	public int getAmountOfInk() {
		this.amountOfInk -= amountOfInkToPrint;
		if(amountOfInk <= 0) {
			return 0;
		}
		else return this.amountOfInk;
	}
	
	public String print() {
		return "À×Å©Á¬ ÇÁ¸°ÅÍ Ãâ·Â";
	}
}
