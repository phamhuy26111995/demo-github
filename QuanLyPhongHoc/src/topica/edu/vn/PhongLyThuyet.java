package topica.edu.vn;

import java.util.Scanner;

public class PhongLyThuyet extends PhongHoc {
	private String mayChieu;
	
	public String getMayChieu() {
		return mayChieu;
	}

	public void setMayChieu(String mayChieu) {
		this.mayChieu = mayChieu;
	}
	
	public PhongLyThuyet(int maPhong, String dayNha, double dienTich, int soBongDen, String mayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.mayChieu = mayChieu;
	}
	 public PhongLyThuyet() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString()+"Máy Chiếu : "+this.mayChieu;
	}
	public void nhap()
	{
		super.nhap();
		System.out.println("Có máy chiếu không ?");
		this.mayChieu=new Scanner(System.in).nextLine();
		
	}
	public boolean chuanLyThuyet()
	{
		if(super.chuanSang() && this.mayChieu.equalsIgnoreCase("Có"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
