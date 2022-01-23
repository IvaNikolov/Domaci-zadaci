package d_21_01_2022;

public class Sektor {
//	Zadatak  
//	Kreirati klasu Sektor koja ima:
//	 naziv sektora
//	 platu koja je za taj sektor
protected String naziv;
protected int plata;
public Sektor(String naziv, int plata) {
	super();
	this.naziv = naziv;
	this.plata = plata;
}
public String getNaziv() {
	return naziv;
}
public void setNaziv(String naziv) {
	this.naziv = naziv;
}
public int getPlata() {
	return plata;
}
public void setPlata(int plata) {
	this.plata = plata;
}

}
