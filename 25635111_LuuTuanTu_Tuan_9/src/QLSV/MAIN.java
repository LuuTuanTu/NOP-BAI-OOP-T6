package QLSV;

import java.time.LocalDate;


public class MAIN {

	public static void main(String[] args) {
		QLSinhVien ds = new QLSinhVien();
		
		SinhVien sv1 = new SVTuxa("SV01", "Nguyen Van A", LocalDate.now() , "LOP A", 5, MonHoc.LAP_TRINH_WEB, "Zoom");
		SinhVien sv2 = new SVTuxa("SV02", "Nguyen Van B", LocalDate.now() , "LOP B", 5, MonHoc.KY_THUAT_PHAN_MEM, "Zoom");
		SinhVien sv3 = new SVChinhquy("SV03", "Nguyen Van C", LocalDate.now() , "LOP B", 5, MonHoc.KY_THUAT_PHAN_MEM, "NVB");
		
		ds.themSV(sv1);
		ds.themSV(sv2);
		ds.themSV(sv3);
		
		ds.sortTen();
		
		ds.inDS();
		System.out.printf("\n");
		ds.sortTienGiam();
		ds.inDS();

	}

}
