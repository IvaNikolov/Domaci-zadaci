package d_24_01_2022;

public class StaklenaAmbalaza extends Ambalaza {
//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//		kaucija za flasu
//		atribut koji kaze da li se za flasu placa kaucija
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
//		racuna cenu
//		ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//		ako se ne placa, (osnovna cena) * 1.2
//		metoda stampaj stampa sve podatke iz klase staklena flasa.
	private double kaucija;

	public double getKaucija() {
		return kaucija;
	}

	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}

	public boolean isPlacaSeKaucija() {
		return placaSeKaucija;
	}

	public void setPlacaSeKaucija(boolean placaSeKaucija) {
		this.placaSeKaucija = placaSeKaucija;
	}

	public double getoCena() {
		return oCena;
	}

	public void setoCena(double oCena) {
		this.oCena = oCena;
	}

	private boolean placaSeKaucija;
	private double oCena;

	public StaklenaAmbalaza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StaklenaAmbalaza(String barkod, String nazivArtikla, int netoTezina, int brutoTezina, double kaucija,
			boolean placaSeKaucija, double oCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		// TODO Auto-generated constructor stub
		this.kaucija = kaucija;
		this.placaSeKaucija = placaSeKaucija;
		this.oCena = oCena;
	}

//	racuna cenu
//	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//	ako se ne placa, (osnovna cena) * 1.2	
	@Override
	public double cena() {
		double cena = 0;
		if (placaSeKaucija) {
			cena = this.oCena * 1.2 + this.kaucija;
		} else {
			cena = this.oCena * 1.2;
		}
		return cena;
	}

	@Override
	public void stampaj() {
		System.out.println("Naziv artikla:" + this.nazivArtikla + " , " + "Barkod:" + this.barkod);
		System.out.println("Neto tezina artikla:" + this.netoTezina + " - " + "Bruto tezina artikla:" + this.brutoTezina
				+ "Kaucija:" + this.kaucija);
		if (placaSeKaucija) {
			System.out.println("Kaucija se placa");
		} else {
			System.out.println("Kaucija se ne placa");
		}
		System.out.println("Osnocna cena je:" + this.oCena);
		System.out.println("Cena je:" + this.cena());

	}
}