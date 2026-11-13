package QLSV;

import java.util.List;

public interface IFTSV{
	
	boolean themSV(SinhVien sv);
	boolean suaSV(String sua, SinhVien sv);
	boolean xoaSV(String ma);
	boolean xoaALL();
	
	SinhVien timMa(String maSV); 
	List<SinhVien> timTen(String tuKhoa);
	List<SinhVien> timLop(String lop);
	List<SinhVien> timLoai(String loai);
	List<SinhVien> timMon(MonHoc monHoc);
	
	int tongSL();
	double tongTT();
	
	void sortTen();
	void sortTienGiam();
	
	
}
