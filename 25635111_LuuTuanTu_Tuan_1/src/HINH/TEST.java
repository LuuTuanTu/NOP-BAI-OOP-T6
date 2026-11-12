package HINH;

public class TEST {

	public static void main(String[] args) {
		HCN hcn =  new HCN(10,20);
		HTRON htron = new HTRON(7.5);
		
		System.out.printf("HÌNH CHỮ NHẬT\n");
		
		System.out.printf("Chiều dài HCN: %d\n", hcn.getCd());
		System.out.printf("Chiều rộng HCN: %d\n", hcn.getCr());
		System.out.printf("Diện tích HCN : %f\n", hcn.DienTich());
		System.out.printf("Chu vi HCN : %f\n", hcn.ChuVi());
		
		System.out.printf("HÌNH TRÒN\n");
		
		System.out.printf("BÁN KÍNH HÌNH TRÒN: %f\n", htron.getR());
		System.out.printf("Diện tích hình tròn: %f\n", htron.DienTich());
		System.out.printf("Chu Vi Hình Tròn: %f", htron.ChuVi());
		
	}

}
