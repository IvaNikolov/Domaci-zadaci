package d_17_01_2022;

public class Transakcija {
//	Kreirati klasu Transakcija koja ima:
//		id transakcije
//		racun sa kog se prenose sredstva
//		racun na koji se prenose sredstva
//		gettere i settere
//		konstruktore
//		privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//		ako je prenos sredstava manji od 4500, provizija je fiksna 45
//		ako je prenos sredstava veci od 4500, provizija je 1% 
//		S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja visinu transakcije
//		Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
//		metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje. 
//		Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).
//		(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//		metodu koja stampa podatke o transakciji u formatu:
//		id transkacije
//		Racun sa: Ime i prezime  -  broj racuna
//		Racun na: Ime i prezime  -  broj racuna

	private int idTransakcije;
	private Racun racunaSaKogaSePrenose;
	private Racun racunNaKojiSePrenose;

	public Transakcija(int idTransakcije, Racun racunaSaKogaSePrenose, Racun racunNaKojiSePrenose) {
		super();
		this.idTransakcije = idTransakcije;
		this.racunaSaKogaSePrenose = racunaSaKogaSePrenose;
		this.racunNaKojiSePrenose = racunNaKojiSePrenose;

	}

	public int getIdTransakcije() {
		return idTransakcije;
	}

	public void setIdTransakcije(int idTransakcije) {
		this.idTransakcije = idTransakcije;
	}

	public Racun getRacunaSaKogaSePrenose() {
		return racunaSaKogaSePrenose;
	}

	public void setRacunaSaKogaSePrenose(Racun racunaSaKogaSePrenose) {
		this.racunaSaKogaSePrenose = racunaSaKogaSePrenose;
	}

	public Racun getRacunNaKojiSePrenose() {
		return racunNaKojiSePrenose;
	}

	public void setRacunNaKojiSePrenose(Racun racunNaKojiSePrenose) {
		this.racunNaKojiSePrenose = racunNaKojiSePrenose;
	}

	// privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja
	// se racuna:
//		ako je prenos sredstava manji od 4500, provizija je fiksna 45
//		ako je prenos sredstava veci od 4500, provizija je 1% 

	private double provizija(double visinaTransakcije) {
		double provizija = 0;
		if (visinaTransakcije < 4500) {
			return provizija = 45;
		} else {
			return provizija = 0.01 * visinaTransakcije;
		}
	}

//	metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje. 
//	Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).
//	(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//	metodu koja stampa podatke o transakciji u formatu:
//	id transkacije
//	Racun sa: Ime i prezime  -  broj racuna
//	Racun na: Ime i prezime  -  broj racuna


	public void transakcija(int vrednostTransakcije) {
		if(this.racunaSaKogaSePrenose.getTrenutnoStanje()>vrednostTransakcije) {
			this.racunNaKojiSePrenose.promenaStanja(-vrednostTransakcije-this.provizija(vrednostTransakcije));
			this.racunNaKojiSePrenose.promenaStanja(vrednostTransakcije);
		}
	}

	public void print() {
		System.out.println(this.idTransakcije);
	    this.getRacunaSaKogaSePrenose().print();
        this.getRacunNaKojiSePrenose().print();
	}
}