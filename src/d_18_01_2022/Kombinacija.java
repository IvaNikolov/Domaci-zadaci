package d_18_01_2022;

import java.util.ArrayList;

public class Kombinacija {
//	Kreirati klasu Kombinacija koja ima:
//		id kombinacije (String)
//		niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//		konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//		gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//		metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija. 
//		Zaglavlje metode je:
//		public boolean daLiJeIstaKombinacija( Kombinacija k)
//		metoda vraca true ako su svi elementi na istim pozicija isti
//		npr: this [0] == k [0], this [1] == k [1] …. 
//		metodu za stampu koja stampa podatke u formatu
//		ID: id kombinacije
//		brojevi: 1, 3, 5, 14, 15, 21, 23

private String id;

ArrayList<Integer>nizBrojeva=new ArrayList<Integer>();

public Kombinacija(String id,int jedan, int dva, int tri, int cetri, int pet, int sest, int sedam) {
	this.id=id;
	nizBrojeva.add(jedan);
	nizBrojeva.add(dva);
	nizBrojeva.add(tri);
	nizBrojeva.add(cetri);
	nizBrojeva.add(pet);
	nizBrojeva.add(sest);
	nizBrojeva.add(sedam);
}
public String getId() {
	return id;	
	
}
public ArrayList<Integer>getNizBrojeva(){
	return nizBrojeva;
}
public boolean daLiJeIstaKombinacija( Kombinacija k) {
	boolean daLiJeIstaKombinacija=false;
	for (int i = 0; i <nizBrojeva.size(); i++) {
		if(this.nizBrojeva.get(i)==k.nizBrojeva.get(i));
		daLiJeIstaKombinacija=true;
		
	}
	return daLiJeIstaKombinacija;
}
//ID: id kombinacije
//brojevi: 1, 3, 5, 14, 15, 21, 23
public void print() {
	System.out.println("ID:"+this.id+"kombinacije");
	System.out.println("Brojevi:");
	for (int i = 0; i < nizBrojeva.size(); i++) {
		System.out.println(this.nizBrojeva.get(i));
	}
}
}
