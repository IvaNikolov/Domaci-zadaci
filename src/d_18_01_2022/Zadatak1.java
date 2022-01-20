package d_18_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ispit first = new Ispit("Racunovodstvo", 7, "Tadija Simonovic");
		Ispit second = new Ispit("Statistika", 9, "Vera Maskovic");

		Student s = new Student(13789, "Milan Jovanovic", "Master");
		s.dodajIspit(first);
		s.dodajIspit(second);

		s.print();
	}

}
