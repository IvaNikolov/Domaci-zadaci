package d_14_01_2022;

public class Osoba {
//	Kreirati klasu Osoba koja ima:
//	Ime i prezime
//	godinu rodjenja
//	pol
//	oca- koji je takodje Osoba
//	majku - takodje je Osoba
//	Gettere i settere
//	difoltni konstruktor
//	konstruktor koji postavlja ime i prezime i godinu rodjenja i pol
//	metodu za stampu koja stampa ovako:
//	Ime i prezime, godina rodjenja [pol]
//	(ako je cale setovan)
//	OTAC: 
//	Stampamo caleta preko njegove metode za stampu
//	(Ako je majka setovana)
//	MAJKA:
//	Stampamo majku preko njene metode za stampu
//	U glavom programu kreirajte svoje porodicno stablo bar do babe i dede :grin:
//	Da vas odmah usmerim, IMAMO SAAAAAMO JEDNU KLASU OSOBA  i imamo main program nista vise od klasa vam ne treba!
	private String imePrezime;
	private int godina;
	private String pol;
	private Osoba otac;
	private Osoba majka;

	public Osoba() {
		// difoltni
	}

	public Osoba(String imePrezime, int godina, String pol) {
		this.imePrezime = imePrezime;
		this.godina = godina;
		this.pol = pol;
		this.otac = otac;
		this.majka = majka;
	}

	public String getImePrezime() {
		return this.imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public int getGodina() {
		return godina;
	}

	public void setGodina(int godina) {
		this.godina = godina;

	}

	public String getPol() {
		return pol;
	}

	public void setPol(String pol) {
		this.pol = pol;
	}

	public Osoba getOtac() {
		return this.otac;
	}
 	void setOtac(Osoba otac) {
		this.otac = otac;
	}

	private Osoba getMajka() {
		return this.majka;
	}

	void setMajka(Osoba majka) {
		this.majka = majka;
	}

	public void print() {
		System.out.println(this.imePrezime + "  " + this.godina + "  " + this.pol);
		System.out.println("Otac:" + this.otac.imePrezime + "  " + this.otac.godina + "  " + this.otac.pol);
		System.out.println("Majka:" + this.majka.imePrezime + "  " + this.majka.godina + "  " + this.majka.pol);
	}
}
