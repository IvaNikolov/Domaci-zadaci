package d_14_01_2022;

public class Vaga {
//	Kreirati klasu Vaga koja ima:
//merna jedinica (kg ili lb)
//proizvod (proizvod koji se meri)
//default-ni konstuktor
//getteri i setteri za sve atribute
//metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije). Na racunanje cene utice i merna jedinica na koju je vaga podesena. 
//metodu stampaj koja stampa racun u formatu:
//               (sifra) - (naziv)
//   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
//   Ukupno: (ukupna cena) 	      

	private String mernaJedinica;
	private Proizvod proizvod;

	public Vaga() {
		// difoltni
	}

	public void setMernaJedinic(String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}

	public String getMernaJedinica() {
		return this.mernaJedinica;
	}

	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}

	public Proizvod getProizvod() {
		return this.proizvod;
	}

//metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije).
//Na racunanje cene utice i merna jedinica na koju je vaga podesena.
	public double sracunajCenu(double tezina) {
		double cena=0;
		if (this.mernaJedinica.equals("kg")) {
			return tezina * this.getProizvod().getCenaKg();
		} else if (this.mernaJedinica.equals("lb")) {
			return tezina * this.getProizvod().getCenaLb();
		} else {
			return cena;
		}
	}

//metodu stampaj koja stampa racun u formatu:
//(sifra) - (naziv)
//(cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
//Ukupno: (ukupna cena) 	     
	public void printRacun(double tezina) {
		this.getProizvod().printProizvod();
		if (this.mernaJedinica.equals("kg")) {
			System.out.println(this.getProizvod().getCenaKg() + " - " + this.mernaJedinica + "x" + tezina);
		} else  {
			System.out.println(this.getProizvod().getCenaLb() + " - " + this.mernaJedinica + "x" + tezina);
		}
		this.proizvod.printProizvod();
		System.out.println("Cena je:" + this.sracunajCenu(tezina));

	}
}
