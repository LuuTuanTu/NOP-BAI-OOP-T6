package QLKH;

import java.util.List;
import java.util.ArrayList;


public class QuanLyKH implements IFQuanLy<KhachHang>{
	private List<KhachHang> ds;

	public QuanLyKH() {
		this.ds = new ArrayList<>();
	}
	
	@Override
	public KhachHang timMa(String ma) {
		for(KhachHang kh : ds) {
			if(kh.getMaKH().equalsIgnoreCase(ma.toLowerCase())) {
				return kh;
			}
		}
		return null;
	}
	
	@Override
	public boolean themKH(KhachHang kh) {
		if(timMa(kh.getMaKH())==null) {
			ds.add(kh);
			return true;
		}
		System.out.printf("\nMã bị trùng\n");
		return false;
	}
	
	@Override
	public boolean xoaKH(String ma) {
		int i = 0;
		for(KhachHang kh:ds) {
			if(kh.getMaKH().equalsIgnoreCase(ma.toLowerCase())) {
				ds.remove(i);
				return true;
			}
			i++;
		}
		return false;
	}
	
	@Override 
	public boolean suaKH(String ma, KhachHang kh2) {
		int i = 0;
		for(KhachHang kh:ds) {
			if(kh.getMaKH().equalsIgnoreCase(ma.toLowerCase())) {
				ds.set(i, kh2);
				return true;
			}
			i++;
		}
		return false;
	}
	
	@Override
	public List<KhachHang> timTen(String ten){
		List<KhachHang> kq = new ArrayList<>();
		for(KhachHang kh : ds) {
			if(kh.getMaKH().contains(ten.toLowerCase())) {
				kq.add(kh);
			}
		}
		if(kq.size()==0) {
			System.out.printf("\nKhông tìm thấy\n");
			return null;
		}
		return kq;
		
	}
	@Override
	public List<KhachHang> layDS(){
		return ds;
	}
	
	public void inDS() {
		for(KhachHang kh : ds) {
			System.out.printf(kh.toString());
			System.out.printf("\n");
		}
	}
}
