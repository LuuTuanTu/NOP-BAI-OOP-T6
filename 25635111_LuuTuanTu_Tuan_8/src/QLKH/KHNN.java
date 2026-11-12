package QLKH;

import java.time.LocalDate;

public class KHNN extends KhachHang{
	
	private String quocTich;

	public String getQuocTich() {return quocTich;}

	public void setQuocTich(String quocTich) {
		if(quocTich.trim().isEmpty()) {
			throw new IllegalArgumentException("Lỗi");
		}
		this.quocTich = quocTich;
	}

	public KHNN(String maKH, String hoTen, LocalDate ngayLapHD, double soKW, double donGia, String quocTich) {
		super(maKH, hoTen, ngayLapHD, soKW, donGia);
		setQuocTich(quocTich);
	}
	
	@Override
    public double thanhtien() {
        return getSoKW() * getDonGia();
    }

	@Override
	public String toString() {
		return "KHNN [quocTich=" + quocTich + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
