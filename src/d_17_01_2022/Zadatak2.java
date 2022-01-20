package d_17_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Racun posiljalac=new Racun("102-88888-5555","Milan Jovanovic",8536);
   Racun primalac=new Racun("105-333333-2222","Vladimir Minic ",1200);
   
   
   Transakcija first=new Transakcija(10,posiljalac,primalac);
   first.print();
   
   first.transakcija(1800);
   first.print();
	}

}
