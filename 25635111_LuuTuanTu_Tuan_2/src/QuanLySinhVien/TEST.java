package QuanLySinhVien;

import java.util.Scanner;

public class TEST {

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(001, "Nguyen Van A", 7.5, 8.9);
		SinhVien sv2 = new SinhVien(002, "Nguyen Van B", 7.0, 8.2);
		
		System.out.printf(sv1.toString());
		System.out.printf("\n");
		System.out.printf(sv2.toString());
		System.out.printf("\n");
		
		Scanner scanner =  new Scanner(System.in);
		
		SinhVien sv3 =  new SinhVien();
		System.out.printf("\nNhập thông tin cho sinh viên 3:\n");
		System.out.printf("\nNhập Mã: ");
		sv3.setMaSV(scanner.nextInt());
		scanner.nextLine();
		
		System.out.printf("\nNhập tên: ");
		sv3.setHoTen(scanner.nextLine());
		System.out.printf("\nNhập điểm lý thuyết: ");
		sv3.setDiemLT(scanner.nextDouble());
		scanner.nextLine();
		System.out.printf("\nNhập điểm thực hành: ");
		sv3.setDiemTH(scanner.nextDouble());
		scanner.nextLine();
		
		
		System.out.printf(sv3.toString());
		
		scanner.close();

	}

}
