package d_24_01_2022;

public class SuperKartica {
//	Kreirati klasu SuperKartica koja ima:
//		broj kartice
//		ime i prezime vlasnika
//		popust (200, 500, … )
//		konstuktore (default-ni i sa parametrima)
//		gettere i settere 
//		metodu stampaj koja stampa karticu u formatu:
//		(broj kartice), (ime i prezime)
	
	public String getBrojKartice() {
		return brojKartice;
	}

	public void setBrojKartice(String brojKartice) {
		this.brojKartice = brojKartice;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public int getPopust() {
		return popust;
	}

	public void setPopust(int popust) {
		this.popust = popust;
	}
	private String brojKartice;
	private String imePrezime;
	private int popust;

	public SuperKartica() {
		// difoltni
	}

	public SuperKartica(String brojKartice, String imePrezime, int popust) {
		super();
		this.brojKartice = brojKartice;
		this.imePrezime = imePrezime;
		this.popust = popust;
	}
//	metodu stampaj koja stampa karticu u formatu:
//	(broj kartice), (ime i prezime)
	public void stampaj() {
		System.out.println("Broj kartice:"+this.brojKartice+" , "+"Ime i prezime vlasnika kartice:"+this.imePrezime);
	}
}
