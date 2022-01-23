package d_21_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog
		Sektor first = new Sektor("Racunovodstvo", 75000);
		Sektor second = new Sektor("Administracija", 50000);
		Sektor third = new Sektor("Finansije", 100000);

		Radnik pera = new Menadzer();
		pera.zaposliUSektor(first);
		pera.zaposliUSektor(second);

		Radnik sima = new Magacioner();
		sima.zaposliUSektor(third);
		sima.zaposliUSektor(second);
		sima.zaposliUSektor(first);

		System.out.println(pera.plata());
		System.out.println(sima.plata());

	}

}
