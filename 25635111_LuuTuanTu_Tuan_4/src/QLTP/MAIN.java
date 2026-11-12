package QLTP;


import java.time.LocalDate;
public class MAIN {

	public static void main(String[] args) {
		QUANLYTHUCPHAM ds = new QUANLYTHUCPHAM();
		
		HangThucPham htp1 = new HangThucPham(001, "HTP1", "Hang1", LocalDate.now(), LocalDate.now().plusDays(200), 120000f);
		HangThucPham htp2 = new HangThucPham(002, "HTP2", "Hang2", LocalDate.now(), LocalDate.now().plusDays(500), 120000f);
		HangThucPham htp3 = new HangThucPham(003, "HTP3", "Hang3", LocalDate.now(), LocalDate.now().plusDays(100), 180000f);
		HangThucPham htp4 = new HangThucPham(004, "HTP4", "Hang4", LocalDate.now(), LocalDate.now().plusDays(700), 130000f);
		HangThucPham htp5 = new HangThucPham(005, "HTP5", "Hang5", LocalDate.now(), LocalDate.now().plusDays(200), 190000f);
		
		ds.themHTP(htp1);
		ds.themHTP(htp2);
		ds.themHTP(htp3);
		ds.themHTP(htp4);
		ds.themHTP(htp5);
		
		ds.inDS();
		
		ds.xoaHTP("HTP3");
		System.out.printf("\nDanh sách sau khi xóa HTP3\n");
		ds.inDS();
		
		System.out.printf("\n");
		ds.sortNHH();
		ds.inDS();
		
		System.out.printf("\n");
		ds.sortGia();
		ds.inDS();
		
		
	}

}
