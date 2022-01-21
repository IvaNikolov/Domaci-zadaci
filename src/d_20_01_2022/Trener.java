package d_20_01_2022;

public class Trener extends Osoba {
//	Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//		godine iskustva
//		tip trenera (kondicioni, za igru, pomocni, personalni)
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.

	private int godineIskustva;
	private String tipTrenera;

	public Trener() {
		super();

	}

	public Trener(String imePrezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
		super(imePrezime, jmbg, godinaRodjenja);
		this.godineIskustva = godineIskustva;
		this.tipTrenera = tipTrenera;

	}

	public int getGodineIskustva() {
		return godineIskustva;
	}

	public void setGodineIskustva(int godineIskustva) {
		this.godineIskustva = godineIskustva;
	}

	public String getTipTrenera() {
		return tipTrenera;
	}

	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;
	}

	public void stampaj() {
		System.out.println("Ime i prezime trenera:" + this.imePrezime + "," + "Godina rodjenja:" + this.godinaRodjenja);
		System.out.println("Godina rodjenja:" + this.godinaRodjenja + "," + "Tip trenera:" + this.tipTrenera);
	}

}
