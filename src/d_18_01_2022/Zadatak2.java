package d_18_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Kombinacija prva=new Kombinacija("k",5,9,23,35,21,15,6);
Kombinacija druga=new Kombinacija("l",5,15,14,36,21,37,17);
Kombinacija treca=new Kombinacija("w",18,9,28,37,25,15,19);

Listic prvi=new Listic();
prvi.dodajKombinaciju(prva);
prvi.dodajKombinaciju(druga);
prvi.dodajKombinaciju(treca);

if(prvi.dobitna(treca)) {
	System.out.println("Ovo je dobitna kombinacija");
}else {System.out.println("Kombinacija nije dobitna.");}
	
	prvi.print();
	
	}

}
