package d_14_01_2022;

public class Knjiga {
//	-ISBN
//	-naziv
//	-godina izdanja
//	-autor
//	-konstuktore koje mislite da su vam potrebni
//	-gettere i settere za atribute
//	-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//	(ISBN)
//	(naziv) - (godina izdanja)
//	autor: (ime autora) (prezime autora) 
private String isbn;
private String naziv;
private int godinaIzdanja;
private Autor autor;

public Knjiga(String isbn,String naziv,int godinaIzdanja, Autor autor) {

              this.isbn=isbn;this.naziv=naziv;this.godinaIzdanja=godinaIzdanja;this.autor=autor;}
            
public void setIsbn(String isbn) {
	this.isbn=isbn;
}
public String getIsbn() {
	return isbn;
}
public void setNaziv(String naziv) {
	this.naziv=naziv;
}
public String getNaziv() {
	return naziv;
}	
public void setGodinaIzdanja(int godinaIzdanja) {
	this.godinaIzdanja=godinaIzdanja;
}
public void setAutor(Autor autor) {
	this.autor=autor;
}
public Autor getAutor() {
	return this.autor;
}
public void print() {
	System.out.println(this.isbn);
	System.out.println(this.naziv+" - "+this.godinaIzdanja);
	System.out.println("Autor:"+this.autor.getIme()+" "+this.autor.getPrezime());
}
}


