package kadai11;

public class RadioKoujou extends Koujou {

	@Override
	public Seihin factoryMethod() {
		// override method
		return new Radio();
	}

	@Override
	public void touroku(Seihin s) {
		// override method
		Radio r = (Radio)s;
		r.numbering();
	}

}
