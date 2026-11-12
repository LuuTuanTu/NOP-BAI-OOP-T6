package QLGD;

import java.time.LocalDate;

public abstract class GiaoDich {
	private String maGD;
	private LocalDate ngayGD;
	private double donGia;
	private double dienTich;
	
	public String getMaGD() {return maGD;}
	public LocalDate getNgayGD() {return ngayGD;}
	public double getDonGia() {return donGia;}
	public double getDienTich() {return dienTich;}
	
	public void setMaGD(String maGD) {
		if(maGD.trim().isEmpty()) {
			throw new IllegalArgumentException("Lỗi");
		}
		this.maGD = maGD;
	}
	public void setNgayGD(LocalDate ngayGD) {
		this.ngayGD = ngayGD;
	}
	public void setDonGia(double donGia) {
		if(donGia<=0) {
			throw new IllegalArgumentException("Lỗi");
		}
		this.donGia = donGia;
	}
	public void setDienTich(double dienTich) {
		if(dienTich<=0) {
			throw new IllegalArgumentException("Lỗi");
		}
		this.dienTich = dienTich;
	}
	
	public abstract double  thanhtien();
	
	
	public GiaoDich(String maGD, LocalDate ngayGD, double donGia, double dienTich) {
		setMaGD(maGD);
		setNgayGD(ngayGD);
		setDonGia(donGia);
		setDienTich(dienTich);
	}
	@Override
	public String toString() {
		return "GiaoDich [maGD=" + maGD + ", ngayGD=" + ngayGD + ", donGia=" + donGia + ", dienTich=" + dienTich + "]";
	}
}
