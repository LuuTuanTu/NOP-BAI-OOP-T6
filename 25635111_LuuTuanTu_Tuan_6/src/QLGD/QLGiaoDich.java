package QLGD;

import java.util.List;
import java.util.ArrayList;

public class QLGiaoDich {
	private List<GiaoDich> ds;
	
	public QLGiaoDich() {
		this.ds = new ArrayList<>();
	}
	
	public GiaoDich timMa(String macantim) {
		for(GiaoDich gd : ds) {
			if(gd.getMaGD().equalsIgnoreCase(macantim.toLowerCase())) {
				return gd;
			}
		}
		return null;
	}
	public boolean them(GiaoDich gd) {
		if(timMa(gd.getMaGD())==null) {
			ds.add(gd);
			return true;
		}
		System.out.printf("\nMã trùng\n");
		return false;
	}
	
	public void inDS() {
		System.out.printf("\nDanh sách giao dịch\n");
		for(GiaoDich gd : ds) {
			System.out.printf(gd.toString());
			System.out.printf("\n");
		}
	}
	
	public double tongtienGD() {
		double tong = 0;
		if(ds.size()==0) {
			System.out.printf("\nDanh sách rỗng\n");
		}
		for(GiaoDich gd: ds) {
			tong+=gd.thanhtien();
		}
		return tong;
	}
	
}
