package d_17_01_2022;

import java.util.ArrayList;

public class MainZeleniKarton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
		ArrayList<ZaleniKarton> zeleniKartoni = new ArrayList<ZaleniKarton>();
		ZaleniKarton karton1 = new ZaleniKarton("Pera Peic", 3159, "Trgovina", "Zoran Preisic", 6);
		ZaleniKarton karton2 = new ZaleniKarton("Sonja Peric", 3155, "Privredno pravo", "Tamara Kerkovic", 9);
		ZaleniKarton karton3 = new ZaleniKarton("Olga Davidvic", 3187, "Finansije", "Evica Petrovic", 6);
		ZaleniKarton karton4 = new ZaleniKarton("Simona Peic", 3174, "Trgovina", "Zoran Preisic", 6);
		ZaleniKarton karton5 = new ZaleniKarton("Ilija Savic", 3160, "Medjunarodna", "Ana Popovic", 7);
		ZaleniKarton karton6 = new ZaleniKarton("Pera Peic", 3182, "Trgovina", "Zoran Preisic", 7);
		ZaleniKarton karton7 = new ZaleniKarton("Sonja Savic", 3196, "Privredno pravo", "Tamara Kerkovic", 7);
		ZaleniKarton karton8 = new ZaleniKarton("Petar Savic", 3142, "Finansije", "Evica Petrovic", 9);
		ZaleniKarton karton9 = new ZaleniKarton("Milos Peic", 3161, "Trgovina", "Zoran Preisic", 6);
		ZaleniKarton karton10 = new ZaleniKarton("Sanja Peic", 3146, "Medjunarodna", "Ana Popovic", 6);

		zeleniKartoni.add(karton1);
		zeleniKartoni.add(karton2);
		zeleniKartoni.add(karton3);
		zeleniKartoni.add(karton4);
		zeleniKartoni.add(karton5);
		zeleniKartoni.add(karton6);
		zeleniKartoni.add(karton7);
		zeleniKartoni.add(karton8);
		zeleniKartoni.add(karton9);
		zeleniKartoni.add(karton10);

		for (int i = 0; i < zeleniKartoni.size(); i++) {
			System.out.println(zeleniKartoni.get(i).getNazivPredmeta() + " - " + zeleniKartoni.get(i).getOcena());
			System.out.println(
					"Student:" + zeleniKartoni.get(i).getStudent() + " - " + zeleniKartoni.get(i).getBrojIndexa());
			System.out.println("Profesor:" + zeleniKartoni.get(i).getProfesor());
			System.out.println();
		}
		double zbirOcena = 0;
		for (int i = 0; i < zeleniKartoni.size(); i++) {
			zbirOcena = zbirOcena + zeleniKartoni.get(i).getOcena();
		}
		double prosek = zbirOcena / zeleniKartoni.size();
		System.out.println("Prosek ocena je:" + prosek);

	}
}
