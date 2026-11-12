package QLGD;

import java.time.LocalDate;

public class GDDat extends GiaoDich{
	private String loaiDat;

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		if(loaiDat.trim().isEmpty()) {
			throw new IllegalArgumentException("Lỗi");
		}
		this.loaiDat = loaiDat;
	}

	public GDDat(String maGD, LocalDate ngayGD, double donGia, double dienTich, String loaiDat) {
		super(maGD, ngayGD, donGia, dienTich);
		setLoaiDat(loaiDat);
	}
	
	@Override
	public  double thanhtien() {
		if(loaiDat.equalsIgnoreCase("A")) {
			return getDonGia() * getDienTich() *1.5;
		}
		return getDonGia() * getDienTich();
	}

	@Override
	public String toString() {
		return "GDDat [loaiDat=" + loaiDat + ", thanhtien()=" + thanhtien() + ", toString()=" + super.toString() + "]";
	}
	
}
