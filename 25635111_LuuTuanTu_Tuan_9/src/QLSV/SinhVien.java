package QLSV;

import java.time.LocalDate;


public class SinhVien {
	protected String maSV;
	protected String hoTen;
	protected LocalDate ngaySinh;
	protected String lop;
	protected int soTinChi;
	protected MonHoc monHoc;
	
	public String getMaSV() {return maSV;}
	public String getHoTen() {return hoTen;}
	public LocalDate getNgaySinh() {return ngaySinh;}
	public String getLop() {return lop;}
	public int getSoTinChi() {return soTinChi;}
	public MonHoc getMonHoc() {return monHoc;}
	
	
	public void setMaSV(String maSV) {
		if(maSV.trim().isEmpty()) {
			throw new IllegalArgumentException("Lỗi"); 
		}	
		this.maSV = maSV;
	}
	public void setHoTen(String hoTen) {
		if(hoTen.trim().isEmpty()) {
			throw new IllegalArgumentException("Lỗi"); 
		}	
		this.hoTen = hoTen;
	}
	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public void setLop(String lop) {
		if(lop.trim().isEmpty()) {
			throw new IllegalArgumentException("Lỗi"); 
		}	
		this.lop = lop;
	}
	public void setSoTinChi(int soTinChi) {
		if(soTinChi<=0) {
			throw new IllegalArgumentException("Lỗi"); 
		}
		this.soTinChi = soTinChi;
	}
	public void setMonHoc(MonHoc monHoc) {
		this.monHoc = monHoc;
	}
	
	public SinhVien(String maSV, String hoTen, LocalDate ngaySinh, String lop, int soTinChi, MonHoc monHoc) {
		setMaSV(maSV);
		setHoTen(hoTen);
		setNgaySinh(ngaySinh);
		setLop(lop);
		setSoTinChi(soTinChi);
		setMonHoc(monHoc);
	}
	public String getLoai() {
		return "Sinh Viên";
	}
	public double thanhtien() {
		return soTinChi * monHoc.getDonGia();
	}
	@Override
	public String toString() {
		return "SinhVien [maSV=" + maSV + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", lop=" + lop + ", soTinChi="
				+ soTinChi + ", monHoc=" + monHoc + ", getLoai()=" + getLoai() + ", thanhtien()=" + thanhtien() + "]";
	}
	
	
	
	
}
