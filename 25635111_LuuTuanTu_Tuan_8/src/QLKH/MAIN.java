package QLKH;

import java.time.LocalDate;

public class MAIN {

	public static void main(String[] args) {
		QuanLyKH ds = new QuanLyKH();
		
		KhachHang kh1 = new KHTN("VN01", "Khách Hàng A", LocalDate.now(), 2000, 30000, "Đối tượng 1", 900);
		KhachHang kh2 = new KHTN("VN02", "Khách Hàng B", LocalDate.now(), 8000, 10000, "Đối tượng 2", 1200);
		KhachHang kh3 = new KHTN("VN03", "Khách Hàng C", LocalDate.now(), 5000, 80000, "Đối tượng 3", 800);
		KhachHang kh4 = new KHNN("NN01", "Khách Hàng D", LocalDate.now(), 1000, 70000, "Raumania");
		KhachHang kh5 = new KHNN("NN02", "Khách Hàng E", LocalDate.now(), 1000, 120000, "Raumania");
		
		ds.themKH(kh1);
		ds.themKH(kh2);
		ds.themKH(kh3);
		ds.themKH(kh4);
		ds.themKH(kh5);
		
		ds.inDS();
		
		ds.xoaKH("NN01");
		ds.inDS();
		
		
		
		
		
		

	}

}
