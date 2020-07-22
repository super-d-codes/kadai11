package kadai11;

public class Counter {
	
	private static int tvNum = 100;
	private static int radioNum = 70;
	
	public static int getTvNumber() {
		return tvNum++;
	}
	
	public static int getRadioNumber() {
		return radioNum++;
	}

}
