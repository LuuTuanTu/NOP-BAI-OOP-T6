package QLKH;

import java.time.LocalDate;

public abstract class KhachHang {
	protected String maKH;
	protected String hoTen;
	protected LocalDate ngayLapHD;
	protected double soKW;
	protected double donGia;
	
	
	public String getMaKH() {return maKH;}
	public String getHoTen() {return hoTen;}
	public LocalDate getNgayLapHD() {return ngayLapHD;}
	public double getSoKW() {return soKW;}
	public double getDonGia() {return donGia;}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public void setHoTen(String hoTen) {
		if(hoTen.trim().isEmpty()) {
			throw new IllegalArgumentException("Lỗi");
		}
		this.hoTen = hoTen;
	}
	public void setNgayLapHD(LocalDate ngayLapHD) {
		this.ngayLapHD = ngayLapHD;
	}
	public void setSoKW(double soKW) {
		if(soKW < 0) {
			throw new IllegalArgumentException("Lỗi");
		}
		this.soKW = soKW;
	}
	public void setDonGia(double donGia) {
		if(donGia < 0) {
			throw new IllegalArgumentException("Lỗi");
		}
		this.donGia = donGia;
	}
	public KhachHang(String maKH, String hoTen, LocalDate ngayLapHD, double soKW, double donGia) {
		setMaKH(maKH);
		setHoTen(hoTen);
		setNgayLapHD(ngayLapHD);
		setSoKW(soKW);
		setDonGia(donGia);
	}
	
	public abstract double thanhtien();
	@Override
	public String toString() {
		return "KhachHang [maKH=" + maKH + ", hoTen=" + hoTen + ", ngayLapHD=" + ngayLapHD + ", soKW=" + soKW
				+ ", donGia=" + donGia + ", thanhtien()=" + thanhtien() + "]";
	}
	

}
