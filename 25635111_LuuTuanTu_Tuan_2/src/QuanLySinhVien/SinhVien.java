package QuanLySinhVien;


public class SinhVien {
	private int maSV;
	private String hoTen;
	private double diemLT;
	private double diemTH;
	
	public SinhVien() {
		this.maSV = 0;
		this.hoTen = "";
		this.diemLT = 0.0;
		this.diemTH = 0.0;
	}

	public int getMaSV() {
		return maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public double getDiemLT() {
		
		return diemLT;
	}

	public double getDiemTH() {
		return diemTH;
	}

	
	
	public void setMaSV(int maSV) {
		if(maSV<=0) {
			this.maSV = 0;
		}
		this.maSV = maSV;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setDiemLT(double diemLT) {
		if(diemLT<=0) {
			this.diemLT = 0.0;
		}
		this.diemLT = diemLT;
	}

	public void setDiemTH(double diemTH) {
		if(diemTH<=0) {
			this.diemTH = 0.0;
		}
		this.diemTH = diemTH;
	}

	public SinhVien(int maSV, String hoTen, double diemLT, double diemTH) {
		setMaSV(maSV);
		setHoTen(hoTen);
		setDiemLT(diemLT);
		setDiemTH(diemTH);		
	}
	
	public double diemTB() {
		return (diemLT + diemTH)/2;
	}

	@Override
	public String toString() {
		return "SinhVien [maSV=" + maSV + ", hoTen=" + hoTen + ", diemLT=" + diemLT + ", diemTH=" + diemTH + "diemTB" + diemTB() + "]";
	}
}
