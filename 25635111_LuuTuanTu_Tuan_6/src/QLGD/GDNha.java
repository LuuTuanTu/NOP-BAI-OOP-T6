package QLGD;

import java.time.LocalDate;

public class GDNha extends GiaoDich{
	private String loaiNha;
	private String diaChi;
	
	public GDNha(String maGD, LocalDate ngayGD, double donGia, double dienTich, String loaiNha, String diaChi) {
		super(maGD, ngayGD, donGia, dienTich);
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}

	public String getLoaiNha() {return loaiNha;}
	public String getDiaChi() {return diaChi;}

	public void setLoaiNha(String loaiNha) {
		if(loaiNha.trim().isEmpty()) {
			throw new IllegalArgumentException("Lỗi");
		}
		this.loaiNha = loaiNha;
	}

	public void setDiaChi(String diaChi) {
		if(diaChi.trim().isEmpty()) {
			throw new IllegalArgumentException("Lỗi");
		}
		this.diaChi = diaChi;
	}
	
	@Override
	public double thanhtien() {
		if(loaiNha.equalsIgnoreCase("Cao cấp")) {
			return getDonGia() * getDienTich();
		}
		return getDonGia() * getDienTich() * 0.9;
	}

	@Override
	public String toString() {
		return "GDNha [loaiNha=" + loaiNha + ", diaChi=" + diaChi + ", thanhtien()=" + thanhtien() + ", toString()="
				+ super.toString() + "]";
	}

}
	