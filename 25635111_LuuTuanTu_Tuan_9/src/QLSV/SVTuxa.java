package QLSV;

import java.time.LocalDate;

public class SVTuxa extends SinhVien{
	private String nenTang;
	

	public String getNenTang() {return nenTang;}
	public void setNenTang(String nenTang) {
		if(nenTang.trim().isEmpty()) {
			throw new IllegalArgumentException("Lỗi");
		}
		this.nenTang = nenTang;
	}
	public SVTuxa(String maSV, String hoTen, LocalDate ngaySinh, String lop, int soTinChi, MonHoc monHoc,
			String nenTang) {
		super(maSV, hoTen, ngaySinh, lop, soTinChi, monHoc);
		setNenTang(nenTang);
	}
	@Override
	public String getLoai() {
		return "Từ xa";
	}
	@Override
	public double thanhtien() {
		return monHoc.getDonGia() * soTinChi * 0.9;
	}
	@Override
	public String toString() {
		return "SVTuxa [nenTang=" + nenTang + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
