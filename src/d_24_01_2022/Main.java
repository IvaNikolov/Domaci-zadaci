package d_24_01_2022;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.
		Ambalaza first = new Tetrapak("123456-789456", "Jogurt", 80, 50, false, 70);
		Ambalaza second = new Tetrapak("123456-789654", "Mleko", 70, 40, false, 60);
		Ambalaza third = new StaklenaAmbalaza("123456-147852", "Pivo", 100, 80, 20, true, 80);

		Korpa prva = new Korpa();
		prva.dodajAmbalazu(third);
		prva.dodajAmbalazu(first);

		SuperKartica k = new SuperKartica("123654", "Pera Peric", 15);

		System.out.println(first.cena());
		System.out.println(second.cena());
		System.out.println(prva.cenaKorpe(k));

		second.stampaj();
		third.stampaj();
	}

}
