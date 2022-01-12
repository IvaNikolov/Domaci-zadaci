package d_11_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Proizvod cvece=new Proizvod();
cvece.naziv="Difembahija";
cvece.cena=600;
cvece.tezina=500;

Proizvod cvece1=new Proizvod();
cvece1.naziv="Orhideja";
cvece1.cena=1000;
cvece1.tezina=250;
 
cvece.stampaj();
cvece1.stampaj();

System.out.println();
int povecanje=10;
cvece.povecajCenu(povecanje);
System.out.println("Nova cena Difrmbahije je:"+cvece.cena+"RSD");
cvece1.povecajCenu(povecanje);
System.out.println("Nova cena Orhideje je:"+cvece1.cena+"RSD");


int popust=20;
System.out.println("Cena Difembahije sa popustom iznosi:"+cvece.vratiCenuSaPopustom(popust));
System.out.println("Cena Orhideje sa popustom iznosi:"+cvece1.vratiCenuSaPopustom(popust));


System.out.println("Postarina za Difembahiju iznosi:"+cvece.racunajPostarinu()+"RSD");
System.out.println("Postarina za Orhideju iznosi:"+cvece1.racunajPostarinu()+"RSD");
	}

}
