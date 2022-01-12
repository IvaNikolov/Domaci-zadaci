package d_11_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartAirConditioning first=new SmartAirConditioning();
		first.nameBrand="Samsung";
		first.potrosnjaDokHladi=2;
		first.potrosnjaDokGreje=4;
		first.mod="hit";
		first.izabranaTemperatura=30;
		
		first.stampaj();
		System.out.println("Mesecna potrosnja klime je:"+first.mesecnaPotrosnja());
		System.out.println("Cena mesecne potrosnje klime je:"+first. cenaMesecnePotrosnje()+"RSD");
	}

}
