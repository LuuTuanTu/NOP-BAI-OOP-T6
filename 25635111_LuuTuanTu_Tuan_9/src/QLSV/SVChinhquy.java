package QLSV;

import java.time.LocalDate;

public class SVChinhquy extends SinhVien{
	private String coSo;

	public String getCoSo() {return coSo;}

	public void setCoSo(String coSo) {
		if(coSo.trim().isEmpty()) {
			throw new IllegalArgumentException("Lỗi");
		}
		this.coSo = coSo;
	}

	public SVChinhquy(String maSV, String hoTen, LocalDate ngaySinh, String lop, int soTinChi, MonHoc monHoc,
			String coSo) {
		super(maSV, hoTen, ngaySinh, lop, soTinChi, monHoc);
		setCoSo(coSo);
	}
	
	@Override
	public String getLoai() {
		return "Chính quy";
	}

	@Override
	public String toString() {
		return "SVChinhquy [coSo=" + coSo + ", toString()=" + super.toString() + "]";
	}	
	
}
