package d_21_01_2022;

public class Menadzer extends Radnik {
//	Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//  override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
	public Menadzer() {
		super();
	}

	double suma = 0;

	@Override
	public double plata() {
		for (int i = 0; i < sektori.size(); i++) {
			suma = suma + sektori.get(i).plata;
		}
		return suma;
	}
}
