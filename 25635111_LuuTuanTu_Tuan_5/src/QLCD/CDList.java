package QLCD;

import java.util.ArrayList;
import java.util.List;


public class CDList {
	private List<CD> ds;
	
	public CDList() {
		this.ds = new ArrayList<>();
	}
	
	public CD timMa(int macantim) {
		for(CD cd : ds) {
			if(cd.getMaCD()==macantim) {
				return cd;
			}
		}
		return null;
	}
	
	public boolean themCD(CD cd){
		if(timMa(cd.getMaCD())==null){
			ds.add(cd);
			return true;
		}
		System.out.printf("\nMã bị trùng\n");
		return false;
	}
	
	public boolean xoa(int macanxoa) {
		int i = 0;
		for(CD cd : ds) {
			if(cd.getMaCD()==macanxoa) {
				ds.remove(i);
				return true;
			}
			i++;
		}
		System.out.printf("\nKhông Tìm thấy mã\n");
		return false;
	}
	
	public List<CD> timTienTo(String tiento){
		List<CD> kq = new ArrayList<>();
		tiento = tiento.toLowerCase();
		for(CD cd : ds){
			if(cd.getTuaCD().toLowerCase().startsWith(tiento)) {
				kq.add(cd);
			}
		}
		if(kq.size()==0) {
			System.out.printf("Không tìm thấy");
			return null;
		}
		return kq;
	}
	
	public List<CD> timGanDung(String tukhoa){
		List<CD> kq = new ArrayList<>();
		tukhoa = tukhoa.toLowerCase();
		for(CD cd : ds) {
			if(cd.getTuaCD().toLowerCase().contains(tukhoa)) {
				kq.add(cd);
			}
		}
		if(kq.size()==0) {
			System.out.printf("Không tìm thấy");
			return null;
		}
		return kq;
	}
	
	public void sortTang() {
		ds.sort((o1,o2)->Double.compare(o1.getGiaThanh(), o2.getGiaThanh()));
		System.out.printf("\nSắp xếp tăng dần theo giá\n");
	}
	public void sortGiam() {
		ds.sort((o1,o2)->Double.compare(o2.getGiaThanh(), o1.getGiaThanh()));
		System.out.printf("\nSắp xếp giảm dần theo giá\n");
	}
	
	public int sl() {
		return ds.size();
	}
	public double giaTB() {
		if(ds.size()==0) {
			return 0;
		}
		double kq = 0;
		for(CD cd : ds) {
			kq+=cd.getGiaThanh();
		}
		return (kq/ds.size());
	}
	
	public void inDS() {
		for(CD cd : ds) {
			System.out.printf(cd.toString());
			System.out.printf("\n");
		}
	}
	
}
