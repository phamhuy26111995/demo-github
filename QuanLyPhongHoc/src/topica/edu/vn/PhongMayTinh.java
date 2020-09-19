package topica.edu.vn;

import java.util.Scanner;

public class PhongMayTinh extends PhongHoc {
	private int soMayTinh;

	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}

	public PhongMayTinh(int maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}
	public PhongMayTinh() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString()+"Số Máy Tính : "+this.soMayTinh+"\n";
	}
	public void nhap()
	{
		super.nhap();
		System.out.println("Số máy tính");
		this.soMayTinh=new Scanner(System.in).nextInt();
		
		
	}
	public boolean chuanMT()
	{
		double trungbinh=this.dienTich/this.soMayTinh;
		if(super.chuanSang() && trungbinh>=1.5)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
