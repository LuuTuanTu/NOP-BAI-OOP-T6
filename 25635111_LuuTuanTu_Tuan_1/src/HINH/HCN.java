package HINH;

public class HCN {
	private int cd;
	private int cr;
	
	public int getCd() {
		return cd;
	}

	public void setCd(int cd){
		if(cd<=0) {
			throw new IllegalArgumentException("Chiều dài phải lớn hơn 0");	
		}
		this.cd = cd;
	}

	public int getCr() {
		if(cr<=0) {
			throw new IllegalArgumentException("Chiều rộng phải lớn hơn 0");	
		}
		return cr;
	}

	public void setCr(int cr) {
		this.cr = cr;
	}

	public HCN(int cd, int cr) {
		setCr(cr);
		setCd(cd);
	}
	
	public double DienTich() {
		return cd*cr;
	}
	
	public double ChuVi() {
		return (cd*cr)*2;
	}

}
