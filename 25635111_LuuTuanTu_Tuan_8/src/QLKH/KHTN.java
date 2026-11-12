package QLKH;

import java.time.LocalDate;

public class KHTN extends KhachHang{
	private String doiTuong;
	private double dinhMuc;
	
	public String getDoiTuong() {return doiTuong;}	
	public double getDinhMuc() {return dinhMuc;}
	
	public void setDoiTuong(String doiTuong) {
		if(doiTuong.trim().isEmpty()) {
			throw new IllegalArgumentException("Lỗi");
		}
		this.doiTuong = doiTuong;
	}
	public void setDinhMuc(double dinhMuc) {
		if(dinhMuc <= 0) {
			throw new IllegalArgumentException("Lỗi");
		}
		this.dinhMuc = dinhMuc;
	}
	
	public KHTN(String maKH, String hoTen, LocalDate ngayLapHD, double soKW, double donGia, String doiTuong,
			double dinhMuc) {
		super(maKH, hoTen, ngayLapHD, soKW, donGia);
		setDinhMuc(dinhMuc);
		setDoiTuong(doiTuong);
	}
	@Override
	public double thanhtien() {
		if (soKW <= dinhMuc) {
            return soKW * donGia;
        }

        return dinhMuc * donGia
                + (soKW - dinhMuc) * donGia * 2.5;
	}
	@Override
	public String toString() {
		return "KHTN [doiTuong=" + doiTuong + ", dinhMuc=" + dinhMuc + ", toString()=" + super.toString() + "]";
	}
	
}
