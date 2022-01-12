package d_11_01_2022;

public class SmartAirConditioning {
	String nameBrand;
	int potrosnjaDokHladi;
	int potrosnjaDokGreje;
	int izabranaTemperatura;
	String mod;

	public void stampaj() {
		System.out.println(this.nameBrand + " " + this.mod + " " + this.izabranaTemperatura + "c");
	}

	public int mesecnaPotrosnja() {
		int mesecnaPotrosnja = 0;
		if (this.mod.equals("hit")) {
			mesecnaPotrosnja = 30 * 15 * this.potrosnjaDokGreje;
		} else if (this.mod.equals("cool")) {
			mesecnaPotrosnja = 30 * 15 * this.potrosnjaDokHladi;
		}
		return mesecnaPotrosnja;
	}

	public int cenaMesecnePotrosnje() {
		int cena = 0;
		if (this.mesecnaPotrosnja() <=350) {
			cena = this.mesecnaPotrosnja() * 6;
		} else {
			cena = (this.mesecnaPotrosnja() - 350) * 9 + 350 * 6;
		}
		return cena;
	}
}
