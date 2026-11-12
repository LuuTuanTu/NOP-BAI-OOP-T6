package QLCD;

public class CD {
	private int maCD;
	private String tuaCD;
	private int soBaiHat;
	private double giaThanh;
	
	public static final int MA_MD = 999999;
	public static final String TUA_MD = "Chua xac dinh";
	
	
	public CD() {
		this.maCD = MA_MD;
		this.tuaCD = TUA_MD;
		this.soBaiHat = 1;
		this.giaThanh = 1.0;
	}


	public int getMaCD() {return maCD;}
	public String getTuaCD() {return tuaCD;}
	public int getSoBaiHat() {return soBaiHat;}
	public double getGiaThanh() {return giaThanh;}
	public static int getMaMd() {return MA_MD;}
	public static String getTuaMd() {return TUA_MD;}


	public void setMaCD(int maCD) {
		if(maCD <= 0 ) {
			throw new IllegalArgumentException("LỖI");
		}
		this.maCD = maCD;
	}

	public void setTuaCD(String tuaCD) {
		if(tuaCD.trim().isEmpty()){
			throw new IllegalArgumentException("LỖI");
		}
		this.tuaCD = tuaCD;
	}
	public void setSoBaiHat(int soBaiHat) {
		if(soBaiHat <= 0) {
			throw new IllegalArgumentException("LỖI");
		}
		this.soBaiHat = soBaiHat;
	}
	public void setGiaThanh(double giaThanh) {
		if(giaThanh < 0) {
			throw new IllegalArgumentException("LỖI");
		}
		this.giaThanh = giaThanh;
	}


	public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
		setMaCD(maCD);
		setTuaCD(tuaCD);
		setSoBaiHat(soBaiHat);
		setGiaThanh(giaThanh);
	}


	@Override
	public String toString() {
		return "CD [maCD=" + maCD + ", tuaCD=" + tuaCD + ", soBaiHat=" + soBaiHat + ", giaThanh=" + giaThanh + "]";
	}
}
