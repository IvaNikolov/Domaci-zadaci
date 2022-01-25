package d_24_01_2022;

import java.util.ArrayList;

public class Korpa {
//	Kreirati klasu Korpa koja ima:
//		niz ambalaza
//		metodu dodaj ambalazu
//		metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//		privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//		metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.

	ArrayList<Ambalaza> nizAmbalaza = new ArrayList<Ambalaza>();

	public Korpa() {
		// difoltni
	}

	public void dodajAmbalazu(Ambalaza ambalaza) {
		nizAmbalaza.add(ambalaza);
	}

	public void izbaciAmbalazu(String barkod) {
		for (int i = 0; i < nizAmbalaza.size(); i++) {
			if (this.nizAmbalaza.get(i).barkod.equals(barkod))
				;
			nizAmbalaza.remove(i);
		}
	}

	private double cenaSaPopustom(int popust) {
		double cenaSaPopustom = 0;
		for (int i = 0; i < nizAmbalaza.size(); i++) {
			cenaSaPopustom = this.nizAmbalaza.get(i).cena() - popust;
		}
		return cenaSaPopustom;
	}

//	metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.
	public double cenaKorpe(SuperKartica kartica) {
		double suma = 0;
		for (int i = 0; i < nizAmbalaza.size(); i++) {
			suma = suma + this.cenaSaPopustom(kartica.getPopust());
		}
		return suma;
	}
}
