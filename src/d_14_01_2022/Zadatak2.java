package d_14_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Proizvod lici =new Proizvod(99,"Lici",130) ;
     Proizvod breskve =new Proizvod(48,"Breskve",200) ;	 
     Vaga kg=new Vaga();
     kg.setProizvod(lici);
     kg.setMernaJedinic("kg");	 
     
     Vaga lb=new Vaga();
     kg.setProizvod(breskve);
     kg.setMernaJedinic("lb");	 
     
     double tezina=3;
     kg.printRacun(tezina);
     lb.printRacun(tezina);
     }
}


