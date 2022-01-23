package d_21_01_2022;

public class Magacioner extends Radnik {

//	Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//		 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//		 suma plata svih sektor / broj sektora * 0.5
//		 override uje metodu za platu, tako da se plata racuna po formuli:
//		(prosecna plata za sve sektore u kojima radi) * (broj sektora).
	public Magacioner() {
		super();	
	}

	private double prosecnaPlataZaSektore() {
		double suma = 0;
		for (int i = 0; i < sektori.size(); i++) {
			suma = suma + sektori.get(i).plata;
		}
		double prosecnaPlataZaSektore = suma / sektori.size() * 0.5;
		return prosecnaPlataZaSektore;
	}

	@Override
	public double plata() {
		double plata = this.prosecnaPlataZaSektore() * sektori.size();
		return plata;
	}
}
