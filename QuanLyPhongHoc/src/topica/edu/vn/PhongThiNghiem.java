package topica.edu.vn;

import java.util.Scanner;

public class PhongThiNghiem extends PhongHoc {
	private String chuyenNganh;
	private int sucChua;
	private String bonRua;
	public String getChuyenNganh() {
		return chuyenNganh;
	}
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}
	public String getBonRua() {
		return bonRua;
	}
	public void setBonRua(String bonRua) {
		this.bonRua = bonRua;
	}
	public PhongThiNghiem(int maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh, int sucChua,
			String bonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.bonRua = bonRua;
	}
	public PhongThiNghiem() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString()+"Chuyên Ngành : "+this.chuyenNganh+"\n"+
								"Sức chứa : "+this.sucChua+"\n"+
								"Bồn rửa : "+this.bonRua+"\n";
	}
	public void nhap()
	{
		super.nhap();
		System.out.println("Nhập Chuyên Ngành");
		this.chuyenNganh=new Scanner(System.in).nextLine();
		System.out.println("Nhập sức chứa");
		this.sucChua=new Scanner(System.in).nextInt();
		System.out.println("Có bồn rửa không ?");
		this.bonRua=new Scanner(System.in).nextLine();
		
	}
	public boolean chuanTN()
	{
		if(super.chuanSang() && this.bonRua.equalsIgnoreCase("Có"))
		{
			return true;
		}
		else
		{
			return false;
			
		}
	}
	
}
