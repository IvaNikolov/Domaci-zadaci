package d_14_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		//U glavnom programu napraviti vise autora sa vise knjiga.

		// TODO Auto-generated method stub
    Autor ij=new Autor("Irvin","Jalom");	
    Autor ds=new Autor("Dejan","Stankovic");
    
    Knjiga first=new Knjiga("130-189-99999","Lecenje Sopenhauerom",2005,ij);
    Knjiga second=new Knjiga("130-190-99999","Kad je Nice plakao",1992,ij);
    Knjiga third=new Knjiga("129-191-99999","Zamalek",2020,ds);
    Knjiga fourth=new Knjiga("129-192-99999","Estoril",2015,ds);
    
    first.print();
    System.out.println();
    second.print();
    third.print();
    fourth.print();
    
}}
