package QLKH;

import java.util.List;

public interface IFQuanLy<KH> {
	boolean themKH(KH kh);
	boolean xoaKH(String ma);
	boolean suaKH(String ma, KH kh);
	
	KH timMa(String ma);
	List<KH> timTen(String ten);
	
	List<KH> layDS();	
}
