package kadai11;

public class Radio extends Seihin {
	
	private int radioSerialNumber;
	
	public void numbering() {
		radioSerialNumber = Counter.getRadioNumber();
	}

	@Override
	public void print() {
		// override method
		System.out.println("このラジオに関する情報:");
		System.out.println("製造番号: " + radioSerialNumber);
	}

}
