package d_11_01_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacebookPost first=new FacebookPost();
		first.ImePrezimeKoJeObjavio="Milan Jovanovic";
		first.ImePrezimeKomeJeObjavljeno="Pera Peric";
		first.tekst="What's up man?";
		first.brojLajkova=20;
		first.brojDeljenja=10;
		
		FacebookPost second=new FacebookPost();
		second.ImePrezimeKoJeObjavio="Pera Peric";
		second.ImePrezimeKomeJeObjavljeno="Milan Jovanovic";
		second.tekst="I'm learning Java, don't ask me anything :(";
		second.brojLajkova=30;
		second.brojDeljenja=15;
		
		
		first.like();
		first.like();
		first.like();
		first.like();
		first.dislike();
		first.share();
		
		System.out.println("Broj lajkova nakon sto je jos 5 osoba videlo post:"+first.brojLajkova);
		System.out.println("Broj serova nakon sto je jos 5 osba videlo posr:"+first.brojDeljenja);
		
		second.like();
        second.like();
        second.like();
        second.like();
        second.dislike();
        second.share();
        System.out.println("Broj lajkova nakon sto je jos 5 osoba videlo post:"+second.brojLajkova);
		System.out.println("Broj serova nakon sto je jos 5 osba videlo posr:"+second.brojDeljenja); 
	}

}
