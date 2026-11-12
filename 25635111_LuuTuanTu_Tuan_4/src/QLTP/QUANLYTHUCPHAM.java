package QLTP;

import java.util.ArrayList;
import java.util.List;

public class QUANLYTHUCPHAM {
	private ArrayList<HangThucPham> ds;
	
	
	
	public QUANLYTHUCPHAM() {
		 this.ds = new ArrayList<>();
	}
	
	public HangThucPham timTheoMa(String maCanTim) {
		for(HangThucPham htp: ds) {
			if(htp.getMaHang().equalsIgnoreCase(maCanTim))
				return htp;
		}
		return null;
	}
	public List<HangThucPham> timTienTo(String tiento) {
		List<HangThucPham> kq =  new ArrayList<>();
		tiento = tiento.toLowerCase();
		for(HangThucPham htp: ds) {
			if(htp.getTenHang().toLowerCase().startsWith(tiento)){
				kq.add(htp);
			}
		}
		if(kq.size() == 0 ) {
			System.out.printf("Không tìm thấy");
		}
		return kq;
	}
	
	public List<HangThucPham> timGanDung(String tukhoa) {
		List<HangThucPham> kq =  new ArrayList<>();
		tukhoa = tukhoa.toLowerCase();
		for(HangThucPham htp: ds) {
			if(htp.getTenHang().toLowerCase().contains(tukhoa)){
				kq.add(htp);
			}
		}
		if(kq.size() == 0 ) {
			System.out.printf("Không tìm thấy");
		}
		return kq;
	}
	
	
	
	public boolean themHTP(HangThucPham htp) {
			if(timTheoMa(htp.getMaHang())==null) {
				ds.add(htp);
				return true;
		}
			System.out.printf("Trùng Mã");
			return false;
	}
	
	public boolean xoaHTP(String MaCanXoa) {
		int i = 0;
		for(HangThucPham htp: ds) {
			if(htp.getMaHang().equalsIgnoreCase(MaCanXoa)) {
				ds.remove(i);
				return true;
			}
			i++;
		}
		System.out.printf("Mã không tồn tại");
		return false;
	}
	
	public boolean suaHTP(String MaCanXua, HangThucPham new_htp) {
		int i = 0;
		for(HangThucPham htp: ds) {
			if(htp.getMaHang().equalsIgnoreCase(MaCanXua)) {
				ds.set(i, new_htp);
				return true;
			}
			i++;
		}
		
		System.out.printf("Mã không tồn tại");
		return false;
	}
	
	
	public void sortGia() {
		ds.sort((h1,h2)-> Float.compare(h1.getGia(), h2.getGia()));
		System.out.printf("\nĐã sắp xếp tăng dần thei giá\n");
	}
	
	public void sortNSX() {
		ds.sort((h1,h2) -> h1.getNgaySX().compareTo(h2.getNgaySX()));
		System.out.printf("\nĐã sắp xếp tăng dần theo NSX\n");
	}
	
	public void sortNHH() {
		ds.sort((h1,h2)-> h1.getNgayHH().compareTo(h2.getNgayHH()));
		System.out.printf("\nĐã sắp xếp tăng dần theo NHH\n");
	}
	
	public void inDS() {
		for(HangThucPham htp : ds) {
			System.out.printf(htp.toString());
			System.out.printf("\n");
		}
	}
	
}
