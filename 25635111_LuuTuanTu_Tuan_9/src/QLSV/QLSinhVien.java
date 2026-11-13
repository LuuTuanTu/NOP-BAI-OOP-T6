package QLSV;

import java.util.List;
import java.util.ArrayList;



public class QLSinhVien implements IFTSV{
	private List<SinhVien> ds;
	
	public QLSinhVien() {
		this.ds = new ArrayList<>();
	}
	
	@Override
	public SinhVien timMa(String ma){
		for(SinhVien sv: ds) {
			if(sv.getMaSV().equalsIgnoreCase(ma.toLowerCase())) {
				return sv;
			}
		}
		return null;
	}
	
	@Override
	public List<SinhVien> timTen(String ten){
		List<SinhVien> kq =  new ArrayList<>();
		for(SinhVien sv: ds) {
			if(sv.getHoTen().equalsIgnoreCase(ten.toLowerCase())) {
				kq.add(sv);
			}
		}
		if(kq.size()==0) {
			return null;
		}
		return kq;
	}
	
	@Override
	public List<SinhVien> timLoai(String loai){
		List<SinhVien> kq =  new ArrayList<>();
		for(SinhVien sv: ds) {
			if(sv.getLoai().equalsIgnoreCase(loai.toLowerCase())) {
				kq.add(sv);
			}
		}
		if(kq.size()==0) {
			return null;
		}
		return kq;
	}
	@Override
	public List<SinhVien> timLop(String lop){
		List<SinhVien> kq =  new ArrayList<>();
		for(SinhVien sv: ds) {
			if(sv.getLop().equalsIgnoreCase(lop.toLowerCase())) {
				kq.add(sv);
			}
		}
		if(kq.size()==0) {
			return null;
		}
		return kq;
	}
	
	@Override
	public List<SinhVien> timMon(MonHoc mh){
		List<SinhVien> kq =  new ArrayList<>();
		for(SinhVien sv: ds) {
			if(sv.getMonHoc().getTenMon().equalsIgnoreCase(mh.getTenMon())) {
				kq.add(sv);
			}
		}
		if(kq.size()==0) {
			return null;
		}
		return kq;
	}
	
	@Override
	public boolean themSV(SinhVien sv) {
		if(timMa(sv.getMaSV())==null) {
			ds.add(sv);
			return true;
		}
		return false;
	}
	
	public boolean xoaSV(String maxoa) {
		int i = 0;
		for(SinhVien sv: ds) {
			if(sv.getMaSV().equalsIgnoreCase(maxoa.toLowerCase())) {
				ds.remove(i);
				return true;
			}
			i++;
		}
		return false;
	}
	
	@Override
	public boolean suaSV(String masua, SinhVien sv2) {
		int i = 0;
		for(SinhVien sv: ds) {
			if(sv.getMaSV().equalsIgnoreCase(masua.toLowerCase())) {
				ds.set(i, sv2);
				return true;
			}
			i++;
		}
		return false;
	}
	
	@Override
	public void sortTen() {
		ds.sort((o1,o2)->o1.getHoTen().compareToIgnoreCase(o2.getHoTen()));
	}
	@Override
	public void sortTienGiam() {
		ds.sort((o1, o2)->Double.compare(o2.thanhtien(), o1.thanhtien()));
	}
	
	@Override
	public int tongSL() {
		return ds.size();
	}
	@Override
	public double tongTT() {
		double tong = 0;
		for(SinhVien sv : ds) {
			tong+=sv.thanhtien();
		}
		return tong;
	}
	
	
	
	@Override
	public boolean xoaALL() {
		ds.clear();
		return true;
	}
	
	public void inDS() {
		for(SinhVien sv : ds){
			System.out.printf(sv.toString());
			System.out.printf("\n");
		}
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
