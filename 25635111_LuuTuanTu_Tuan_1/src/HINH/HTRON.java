package HINH;

public class HTRON {
	private double r;

	public double getR() {
		return r;
	}

	public void setR(double r) {
		if(r<=0) {
			throw new IllegalArgumentException("Lỗi");
		}
		this.r = r;
	}

	public HTRON(double r) {
		setR(r);
	}
	
	public double DienTich() {
		return r*r*3.14;
	}
	public double ChuVi() {
		return 2*3.14*r;
	}
		
}
