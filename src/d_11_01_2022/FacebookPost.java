package d_11_01_2022;

public class FacebookPost {
	String ImePrezimeKoJeObjavio;
	String ImePrezimeKomeJeObjavljeno;
	String tekst;
	int brojLajkova;
	int brojDeljenja;

	public void like() {
		this.brojLajkova = this.brojLajkova + 1;
	}

	public void dislike() {

		if (this.brojLajkova < 0) {
			this.brojLajkova = 0;
		} else {
			this.brojLajkova = this.brojLajkova - 1;
		}
	}

	public void share() {
		this.brojDeljenja = this.brojDeljenja + 1;
	} // print(), koja stampa objavu u formatu:
		// (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
		// (tekst objave)
		// Likes (broj lajkova) | Shares (broj deljenja)

	public void stampaj() {
		System.out.println(this.ImePrezimeKoJeObjavio + ">>>" + this.ImePrezimeKomeJeObjavljeno);
		System.out.println(this.tekst);
		System.out.println("Likes" + this.brojLajkova + "|" + "Shares" + this.brojDeljenja);
	}

}
