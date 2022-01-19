package d_17_01_2022;

public class ZaleniKarton {
//	ime i prezime studenta 
//	broj indeksa 
//	naziv predmeta
//	ime i prezime profesora
//	ocenu - od 5 do 10
//	gettere i settere
//	konstruktore
//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//	metodu stampaj koja stampa podatke u formatu:
//			(naziv predmeta) - (ocena)
//			Student: ime i prezime, broj indeksa
//			Profesor: ime i prezime
	private String student;
	private int brojIndexa;
	private String nazivPredmeta;
	private String profesor;
	private int ocena;
    public ZaleniKarton() {
    }
    
	public ZaleniKarton(String student, int brojIndexa, String nazivPredmeta, String profesor,int ocena) {
		//super();
		this.student = student;
		this.brojIndexa = brojIndexa;
		this.nazivPredmeta = nazivPredmeta;
		this.profesor = profesor;
		this.ocena=ocena;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public int getBrojIndexa() {
		return brojIndexa;
	}

	public void setBrojIndexa(int brojIndexa) {
		this.brojIndexa = brojIndexa;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public int getOcena() {
		return ocena;
	}

	public boolean rezIspita() {
		boolean ispitPolozen = true;
		if (this.ocena == 5) {
			ispitPolozen = false;
		}
		return ispitPolozen;
	}

	public void print() {
		System.out.println(this.nazivPredmeta + "-" + this.ocena);
		System.out.println("Student:" + this.student + "  " + this.brojIndexa);
		System.out.println("Profesor:" + this.profesor);
	}
}
