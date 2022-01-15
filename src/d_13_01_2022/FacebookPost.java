package d_13_01_2022;

public class FacebookPost {
	private String ImePrezimeKoJeObjavio;
	private String ImePrezimeKomeJeObjavljeno;
	private String tekst;
	private int brojLajkova;
	private int brojDeljenja;
	
	public FacebookPost() {//difoltni
	}
	
	public FacebookPost(String ImePrezimeKoJeObjavio,String ImePrezimeKomeJeObjavljeno,String tekst) {
	         this.ImePrezimeKoJeObjavio=ImePrezimeKoJeObjavio;
	         this.ImePrezimeKomeJeObjavljeno=ImePrezimeKomeJeObjavljeno;
	         this.tekst=tekst;
	}
	public String getImePrezimeKoJeObjavio() {
		return this.ImePrezimeKoJeObjavio;
	}
    public void  setImePrezimeKoJeObjavio(String ImePrezimeKoJeObjavio) {
    	this.ImePrezimeKomeJeObjavljeno=ImePrezimeKoJeObjavio;
    }
    public String getImePrezimeKomeJeObjavljeno() {
    	return this.ImePrezimeKomeJeObjavljeno;
    }
    public void setImePrezimeKomeJeObjavljeno(String ImePrezimeKomeJeObjavljeno) {
        this.ImePrezimeKomeJeObjavljeno=ImePrezimeKomeJeObjavljeno;
    }  
    public String getTekst() {
        return this.tekst;
    }
    public void  setTekst(String tekst) {
    	this.tekst=tekst;
    }
    public int getBrojLajkova() {
    	return this.brojLajkova;
    
    }
    public int getBrojDeljenja() {
    	return this.brojDeljenja;
    }
    public void like() {
		this.brojLajkova = this.brojLajkova + 1;
	}
    public void dislike() {

		if (this.brojLajkova < 0) {
			this.brojLajkova = 0;
		} else {
			this.brojLajkova = this.brojLajkova - 1;
		}}
		public void share() {
			this.brojDeljenja = this.brojDeljenja + 1;
    }
    public void stampaj() {
		System.out.println(this.ImePrezimeKoJeObjavio + ">>>" + this.ImePrezimeKomeJeObjavljeno);
		System.out.println(this.tekst);
		System.out.println("Likes" + this.brojLajkova + "|" + "Shares" + this.brojDeljenja);
	}

}
    
    
