package kadai11;

public class TvKoujou extends Koujou {

	@Override
	public Seihin factoryMethod() {
		// override method
		return new Television();
	}

	@Override
	public void touroku(Seihin s) {
		// override method
		Television t = (Television)s;
		t.numbering();
		t.setDate(Date.today());
	}

}
