package kadai11;

public abstract class Koujou {
	
	public final Seihin create() {
		Seihin seihin = factoryMethod();
		touroku(seihin);
		return seihin;
	}
	
	public abstract Seihin factoryMethod();
	public abstract void touroku(Seihin s);

}
