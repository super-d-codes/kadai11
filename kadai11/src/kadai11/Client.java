package kadai11;

public class Client {

	public static void main(String[] args) {
		Koujou koujou1 = new TvKoujou();
		Koujou koujou2 = new RadioKoujou();
		
		Seihin[] array = new Seihin[3];
		array[0] = koujou1.create();
		array[1] = koujou2.create();
		array[2] = koujou1.create();
		
		for(int i=0; i<array.length; i++) {
			array[i].print();
		}
	}

}
