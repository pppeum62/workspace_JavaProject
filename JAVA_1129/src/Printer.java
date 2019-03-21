
public abstract class Printer {
	public static int USB = 0;
	public static int PARALLEL = 1;
	private String modelName; //모델 이름
	private String manufacturer; //제조사
	private String type; //USB또는 병렬 프린터
	protected int numberOfPrinted; //인쇄한 종이 매수
	protected int numberOfPaper; //남은 종이 매수
	abstract public String print();
	
	public void setModelName(String modelname) {
		this.modelName = modelname;
	}
	
	public String getModelName() {
		return this.modelName;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String setManufacturer() {
		return this.manufacturer;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public int getNumberOfPaper() {
		this.numberOfPaper -= this.numberOfPrinted;
		if(numberOfPaper <= 0)
			return 0;
		else
			return numberOfPaper;
	}
	
	public Printer(String modelName, String manufacturer, String type,
			int numberOfPaper, int numberOfPrinted) {
		this.modelName = modelName;
		this.manufacturer = manufacturer;
		this.type = type;
		this.numberOfPaper = numberOfPaper;
		this.numberOfPrinted = numberOfPrinted;
	}

}
