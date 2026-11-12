package QLTP;

import java.time.LocalDate;

public class HangThucPham {
	private int id;
	private final String maHang;
	private String tenHang;
	private LocalDate ngaySX;
	private LocalDate ngayHH;
	private float gia;
	
	
	public HangThucPham() {
		this.id = 000;
		this.maHang = "MAC_DINH"; 
		this.tenHang = "Hang mac dinh"; 
		this.ngaySX = LocalDate.now();
		this.ngayHH = LocalDate.now().plusDays(7);
		this.gia = 1.0f;
	}

	public int getId() {return id;}
	public String getMaHang() {return maHang;}
	public String getTenHang() {return tenHang;}
	public LocalDate getNgaySX() {return ngaySX;}
	public LocalDate getNgayHH() {return ngayHH;}
	public float getGia() {return gia;}
	
	public void setId(int id) {
		this.id = id;
	}
	
	

	public void setTenHang(String tenHang) {
		if(tenHang.trim().isEmpty()) {
			throw new IllegalArgumentException("Tên hàng không được để trống");
		}
		this.tenHang = tenHang;
	}
	
	

	public void setNgaySX(LocalDate ngaySX) {
		if(ngaySX.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Lỗi ngày sản xuất");
		}
		this.ngaySX = ngaySX;
	}

	public void setNgayHH(LocalDate ngayHH) {
		if(ngayHH.isBefore(ngaySX)) {
			throw new IllegalArgumentException("Lỗi ngày hết hạn");
		}
		this.ngayHH = ngayHH;
	}

	public void setGia(float gia) {
		if(gia < 0) {
			throw new IllegalArgumentException("Lỗi giá");
		}
		this.gia = gia;
	}

	
	public boolean kiemtraHSD(){
		if(ngayHH.isEqual(LocalDate.now())) {
			return true;
		}
		return false;
	}
	
	
	public HangThucPham(int id, String maHang, String tenHang, LocalDate ngaySX, LocalDate ngayHH, float gia) {
		setId(id);
		this.maHang = maHang;
		setTenHang(tenHang);
		setNgaySX(ngaySX);
		setNgayHH(ngayHH);
		setGia(gia);
	}

	public String status(){
		LocalDate today = LocalDate.now();
		if(today.isBefore(ngaySX)) return "Chưa Sản Xuất";
		if(today.isAfter(ngayHH)) return "Đã hết hạn";
		if(today.isEqual(ngayHH)) return "Hết hạn hôm nay";	
		
		return "Còn" + (ngayHH.toEpochDay()-LocalDate.now().toEpochDay()) + "ngày";
		
	}
	protected Object clone() throws CloneNotSupportedException {
	    throw new CloneNotSupportedException("Khong the sao chep HangThucPham!");
	}

	@Override
	public String toString() {
		return "HangThucPham [id=" + id + ", maHang=" + maHang + ", tenHang=" + tenHang + ", ngaySX=" + ngaySX
				+ ", ngayHH=" + ngayHH + ", gia=" + gia + "]";
	}
	
}
