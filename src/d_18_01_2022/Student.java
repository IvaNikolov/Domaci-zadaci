package d_18_01_2022;

import java.util.ArrayList;

public class Student {
public Student(int brojIndexa, String imePrezime, String tipStudije, ArrayList<Ispit> ispiti) {
		super();
		this.brojIndexa = brojIndexa;
		ImePrezime = imePrezime;
		this.tipStudije = tipStudije;
		this.ispiti = ispiti;
	}
//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta
//	metodu dodaj ispit u niz ispita
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)
private int brojIndexa;
private String ImePrezime;
private String tipStudije;
private ArrayList<Ispit>ispiti=new ArrayList<Ispit>();
public Student(int brojIndexa, String imePrezime, String tipStudije) {
	//super();
	this.brojIndexa = brojIndexa;
	ImePrezime = imePrezime;
	this.tipStudije = tipStudije;
	this.ispiti = ispiti;
}
public Student() {
	///defoltni
}
public int getBrojIndexa() {
	return brojIndexa;
}
public void setBrojIndexa(int brojIndexa) {
	this.brojIndexa = brojIndexa;
}
public String getImePrezime() {
	return ImePrezime;
}
public void setImePrezime(String imePrezime) {
	ImePrezime = imePrezime;
}
public String getTipStudije() {
	return tipStudije;
}
public void setTipStudije(String tipStudije) {
	this.tipStudije = tipStudije;
}
public ArrayList<Ispit> getIspiti() {
	return ispiti;
}
public void dodajIspit(Ispit ispit) {
	this.ispiti.add(ispit);
}
//metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
public double prosek() {
	double zbir=0;
	int brojac =0;
	for (int i = 0; i < ispiti.size(); i++) {
		if(this.ispiti.get(i).polozenIspit()) {
			zbir=zbir-this.ispiti.get(i).getOcena();
			brojac ++;
			
		}
	}
	return zbir/brojac;
}
//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
public void print() {
	System.out.println(this.brojIndexa+" - "+this.ImePrezime+" - "+this.tipStudije);
	System.out.println("Predmeti:");
	System.out.println();
	for (int i = 0; i < ispiti.size(); i++) {
		this.getIspiti().get(i).print();
	}
	System.out.println("Prosecna ocena:"+this.prosek());
}
}

 