package QLTP;


	public class TestHangHoa {

		public static void main(String[] args) {
			QuanLyHangHoa ds = new QuanLyHangHoa();
			
			HangHoa hh1 = new HangHoa("HH01", "HANG HOA 1", "HANG 1", 150000, 23);
			HangHoa hh2 = new HangHoa("HH02", "HANG HOA 2", "HANG 2", 103000, 28);
			HangHoa hh3 = new HangHoa("HH03", "HANG HOA 3", "HANG 3", 100000, 23);
			HangHoa hh4 = new HangHoa("HH04", "HANG HOA 4", "HANG 4", 203400, 28);
			HangHoa hh5 = new HangHoa("HH05", "HANG HOA 5", "HANG 5", 90000, 9);
			
			//THEM CAC HANG HOA VAO DANH SACH
			ds.them(hh1);
			ds.them(hh2);
			ds.them(hh3);
			ds.them(hh4);
			ds.them(hh5);
			ds.xuat();
			//THEM MOT HANG HOA CO MA BI TRUNG
			
			HangHoa hh6 = new HangHoa("HH05", "HANG HOA 5", "HANG 5", 90000, 9);
			ds.them(hh6);
			System.out.printf("\nDANH SACH SAU KHI THEM MA BI TRUNG\n");
			ds.xuat();
			System.out.printf("\nThem vao Danh Sach mot ma hop le\n");
			HangHoa hh7 = new HangHoa("HH07", "HANG HOA 7", "HANG 7", 95000, 10);
			
			System.out.printf("\nDANH SACH SAU KHI THEM MA\n");
			ds.them(hh7);
			ds.xuat();
			
			
			//SUA
			System.out.printf("\nCHINH SUA GIA SO SAN PHAM HH04 THANH 99999\n");
			ds.edit("HH04", 99999);
			ds.xuat();
			
			//XUAT DS CAC HANG CO SO LUONG HANG TON LON NHAT
			ds.hang_ton_max();
			
			System.out.printf("\nXoa mot hang hoa VD: HH01\n");
			ds.xoa("HH01");
			
			System.out.printf("\nDANH SACH SAU KHI XOA\n");
			ds.xuat();
			
			System.out.printf("\nXoa mot hang hoa ko ton tai\n");
			ds.xoa("HH08");
			
			System.out.printf("\nDANH SACH SAU KHI XOA\n");
			ds.xuat();
			

		}

	}


