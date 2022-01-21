package d_20_01_2022;

public class Igrac extends Osoba {
//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
	private int brojIgraca;
	private String pozicija;
	private boolean kapiten;

	public Igrac() {
		// defoltni
	}

	public int getBrojIgraca() {
		return brojIgraca;
	}

	public void setBrojIgraca(int brojIgraca) {
		this.brojIgraca = brojIgraca;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}

	public Igrac(String imePrezime, String jmbg, int godinaRodjenja, int brojIgraca, String pozicija, boolean kapiten) {
		super(imePrezime, jmbg, godinaRodjenja);
		this.brojIgraca = brojIgraca;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
	}

	public void stampaj() {
		System.out.println("Ime i prezime:" + this.imePrezime + " , " + "Godina rodjenja:" + this.godinaRodjenja);
		System.out.println(
				"Broj pod kojim igrac igra:" + this.brojIgraca + "," + "Pozicija na kojoj igrac igra:" + this.pozicija);
		if (this.kapiten) {
			System.out.println("Igrac je kapitan.");
		} else {
			System.out.println("Igrac nije kapiten.");
		}
	}
}
