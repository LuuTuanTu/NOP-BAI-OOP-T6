package QLTP;
	public class QuanLyHangHoa {
		private int sl;
		private int size;
		private HangHoa[] ds;
		
		public QuanLyHangHoa() {
			sl = 0;
			size = 5;
			ds = new HangHoa[size];
		}
		
		//MO RONG MANG
		public void mo_rong() {
			int n_size = size*2;
			HangHoa[] nds = new HangHoa[n_size];
			for(int i = 0; i<sl; i++) {
				nds[i] = ds[i];
			}
			ds = nds;
			size = n_size;
		}
		//THEM
		public void them(HangHoa hh) {
			if(sl == size) {
				mo_rong();
			}
			for(int i = 0; i<sl; i++) {
				if(ds[i].getMa().compareToIgnoreCase(hh.getMa())==0) {
					System.out.printf("\nMa bi trung\n");
					return;
				}
			}
			ds[sl] = hh;
			sl++;
		}
		//TIM
		public int tim(String macantim) {
			for(int i = 0; i<sl; i++) {
				if(ds[i].getMa().compareToIgnoreCase(macantim)==0){
					return i;
				}
			}
			return -1;
		}
		//XOA
		
		public void edit(String macanxua, double giamoi) {
			int find = tim(macanxua);
			if(find == -1) {
				System.out.printf("Ma ko ton tai");
				return;
			}
			ds[find].setGia(giamoi);
		}
		
		public void xoa(String macanxoa) {
			int index = tim(macanxoa);
			if(index == -1) {
				System.out.printf("Khong tim thay ma");
				return;
			}
			for(int i = index; i<sl-1; i++) {
					ds[i] = ds[i+1];
			}
			sl--;
		}
		//XUAT
		public void xuat() {
			System.out.printf("\nSTT\tID\tTen\t\tHang\tGia\t\tSLT\tThanh tien\n");
			for(int i = 0; i<sl ; i++) {
				System.out.printf("\n%d\t%s\t%s\t%s\t%f\t%f\t%f", i+1, ds[i].getMa(), ds[i].getTen(),
									ds[i].getHang(), ds[i].getGia(), ds[i].getSlt(), ds[i].thanhtien());
				
			}		
		}
		//SLT TON MAX
		public double sltmax() {
			double max = 0;
			for(int i = 0; i<sl; i++) {
				if(ds[i].getSlt() > max) {
					max = ds[i].getSlt();
				}
			}
			return max;
		}
		
		public void hang_ton_max() {
			double max = sltmax();
			System.out.printf("\nHang ton co so luong cao nhat\n");
			for(int i = 0; i<sl ; i++) {
				if(ds[i].getSlt() == max) {
				System.out.printf("\n%d\t%s\t%s\t%s\t%f\t%f\t%f", i+1, ds[i].getMa(), ds[i].getTen(),
									ds[i].getHang(), ds[i].getGia(), ds[i].getSlt(), ds[i].thanhtien());
				}
			}	
			
		}
		
	}


