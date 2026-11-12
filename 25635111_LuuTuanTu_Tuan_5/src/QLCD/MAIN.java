package QLCD;



public class MAIN {

	public static void main(String[] args) {
		CDList ds = new CDList();
		
		CD cd1 = new CD(001, "CD1", 30, 10000);
		CD cd2 = new CD(002, "CD2", 50, 20000);
		CD cd3 = new CD(003, "CD3", 70, 3000);
		CD cd4 = new CD(004, "CD4", 90, 5000);
		CD cd5 = new CD(005, "CD5", 1000, 9000);
		
		
		ds.themCD(cd1);
		ds.themCD(cd2);
		ds.themCD(cd3);
		ds.themCD(cd4);
		ds.themCD(cd5);
		
		ds.inDS();
		
		ds.sortTang();
		ds.inDS();
		
		ds.sortGiam();
		ds.inDS();
		
		ds.xoa(004);
		ds.inDS();
		
		

	}

}
