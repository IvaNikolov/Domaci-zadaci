package d_24_01_2022;

public class Tetrapak extends Ambalaza {
//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//		atribut koji kaze da li se moze reciklirati
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
//		racuna cenu tako da ispunjava uslova:
//		ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//		ako nije u cenu ulazi samo osnovna cena
//		metoda stampaj stampa sve podatke iz klase tetrapak.
	private boolean daReciklaza;

	public boolean isDaReciklaza() {
		return daReciklaza;
	}

	public void setDaReciklaza(boolean daReciklaza) {
		this.daReciklaza = daReciklaza;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	private double osnovnaCena;

	public Tetrapak() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tetrapak(String barkod, String nazivArtikla, int netoTezina, int brutoTezina, boolean daReciklaza,
			double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);

		this.daReciklaza = daReciklaza;
		this.osnovnaCena = osnovnaCena;
	}

	// racuna cenu tako da ispunjava uslova:
//		ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//		ako nije u cenu ulazi samo osnovna cena
	@Override
	public double cena() {
		double cena = 0;
		if (daReciklaza) {
			cena = this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
		} else {
			cena = this.osnovnaCena;
		}
		return cena;
	}

	public void stampaj() {
		System.out.println("Naziv artikla:"+this.nazivArtikla+" , "+"Barkod:"+this.barkod);
		System.out.println("Neto tezina artikla:"+this.netoTezina+" - "+"Bruto tezina artikla:"+this.brutoTezina);
		if(daReciklaza) {
			System.out.println("Ovaj se proizvod se moze reciklirati.");
		}else {System.out.println("Ovaj proizvod se ne moze reciklirati.");
		
	}
		System.out.println("Osnovna cena:"+this.osnovnaCena);
		System.out.println("Cena proizvoda je:"+this.cena());
}}
