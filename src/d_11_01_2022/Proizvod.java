package d_11_01_2022;

public class Proizvod {
String naziv;
double cena;
double tezina;
public void stampaj() {
	System.out.println(this.naziv+" "+this.cena+" "+"RSD"+" "+this.tezina+" "+"grama");}
	
	public void povecajCenu(int povecanje) {
		this.cena=this.cena+povecanje;}
		
		
	public double vratiCenuSaPopustom(int popust) {	
		double cenaSaPopustom;
		return cenaSaPopustom=this.cena-this.cena*popust/100;}
		
	public double racunajPostarinu() {	//za tezinu do 100g, postarina iznosi 200din
	int postarina=0;                     // za tezinu od 101g do 500g, postarina iznosi 400din
	     if(this.tezina<=100) {                              //za tezinu preko 500g, postarina iznosi 1000din
         postarina=200;}
	     else if(this.tezina<=500) {
	     postarina=400;}
	     else {postarina=1000;}
	return postarina;
}   
	
}
