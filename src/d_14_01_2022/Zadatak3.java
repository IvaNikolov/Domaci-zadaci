package d_14_01_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Osoba bakaTata = new Osoba("Branislava Nikolov", 1928, "z");
		Osoba dekaTata = new Osoba("Rajco Nikolov", 1925, "m");
		Osoba bakaMama = new Osoba("Katarina Tamburic", 1933, "z");
		Osoba dekaMama = new Osoba("Caslav Tamburic", 1926, "m");
		Osoba majka = new Osoba("Biljana Nikolov", 1957, "z");
		majka.setMajka(bakaMama);
		majka.setOtac(dekaMama);
		Osoba otac = new Osoba("Zvonko Nikolov", 1954, "m");
		otac.setOtac(dekaTata);
		otac.setMajka(bakaTata);
		Osoba me = new Osoba("Iva Nikolov", 1986, "z");
		me.setMajka(majka);
		me.setOtac(otac);
		me.print();
		majka.print();
		otac.print();
	}

}
