package QLTP;

public class HangHoa {
	private String ma;
	private String ten;
	private String hang;
	private double gia;
	private double slt;
	public String getMa() {
		return ma;
	}
	public String getTen() {
		return ten;
	}
	public String getHang() {
		return hang;
	}
	public double getGia() {
		return gia;
	}
	public double getSlt() {
		return slt;
	}
	public void setMa(String ma) {
		if(ma.isEmpty()) {
			throw new IllegalArgumentException("Loi");		
		}
		this.ma = ma;
	}
	public void setTen(String ten) {
		if(ten.isEmpty()) {
			throw new IllegalArgumentException("Loi");		
		}
		this.ten = ten;
	}
	public void setHang(String hang) {
		if(hang.isEmpty()) {
			throw new IllegalArgumentException("Loi");		
		}
		this.hang = hang;
	}
	public void setGia(double gia) {
		if(gia <=0) {
			throw new IllegalArgumentException("Loi");	
		}
		this.gia = gia;
	}
	public void setSlt(double slt) {
		if(slt < 0) {
			throw new IllegalArgumentException("Loi");	
		}
			
		this.slt = slt;
	}
	
	public HangHoa(String ma, String ten, String hang, double gia, double slt) {
		setMa(ma);
		setTen(ten);
		setHang(hang);
		setSlt(slt);
		setGia(gia);
	}
	
	public double thanhtien() {
		return gia * slt;
	}
	@Override
	public String toString() {
		return "HangHoa [ma=" + ma + ", ten=" + ten + ", hang=" + hang + ", gia=" + gia + ", slt=" + slt + "]";
	}
}
