package QLGD;
import java.time.LocalDate;

public class MAIN {

	public static void main(String[] args) {
		QLGiaoDich ds = new QLGiaoDich();
				
		GDNha gd1 = new GDNha("N01",LocalDate.now(), 200000, 2000, "Cao Cấp", "12 Yên Lãng");
		GDNha gd2 = new GDNha("N02",LocalDate.now(), 300000, 3000, "Bình Dân", "13 Yên Lãng");
		GDNha gd3 = new GDNha("N03",LocalDate.now(), 400000, 4000, "Cao Cấp", "14 Yên Lãng");
		
		GDDat gd4 = new GDDat("D01", LocalDate.now(), 30000, 2300, "A");
		GDDat gd5 = new GDDat("D02", LocalDate.now(), 70000, 8300, "B");
		
		ds.them(gd1);
		ds.them(gd2);
		ds.them(gd3);
		ds.them(gd4);
		ds.them(gd5);
		
		ds.inDS();
		
		System.out.printf("Tổng số tiền giao dịch : %f", ds.tongtienGD());
		
		
		
	}

}
