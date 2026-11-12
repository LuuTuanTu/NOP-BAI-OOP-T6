package Vehicle;

public class XE {
	private String chuXe;
	private String loaiXe;
	private int dungTich;
	private double gia;
	
	public XE() {
		this.chuXe = "";
		this.loaiXe = "";
		this.dungTich = 0;
		this.gia = 0.0;
	}

	public String getChuXe() {
		return chuXe;
	}

	public void setChuXe(String chuXe) {
		this.chuXe = chuXe;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public int getDungTich() {
		return dungTich;
	}

	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public XE(String chuXe, String loaiXe, int dungTich, double gia) {
		this.chuXe = chuXe;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.gia = gia;
	}
	
	public double tax() {
		if(dungTich < 100) {
			return gia * 0.01;
		}
		else if(dungTich <= 200) {
			return gia * 0.03;
		}
		return gia * 0.05;
	}

	@Override
	public String toString() {
		return "XE [chuXe=" + chuXe + ", loaiXe=" + loaiXe + ", dungTich=" + dungTich + ", gia=" + gia + ", tax()="
				+ tax() + "]";
	}
	
}

