package topica.edu.vn;

import java.util.Collections;
import java.util.Scanner;

public class PhongHoc {
	protected int maPhong;
	protected  String dayNha;
	protected  double dienTich;
	protected  int soBongDen;
	public int getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(int maPhong) {
		this.maPhong = maPhong;
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}
	public PhongHoc(int maPhong, String dayNha, double dienTich, int soBongDen) {
		super();
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}
	public PhongHoc() {
	
	}
	public void nhap()
	{
		System.out.println("Mời bạn nhập vào mã phòng");
		this.maPhong=new Scanner(System.in).nextInt();
		System.out.println("Mời bạn nhập vào dãy nhà");
		this.dayNha=new Scanner(System.in).nextLine();
		System.out.println("Mời bạn nhập vào diện tích");
		this.dienTich=new Scanner(System.in).nextDouble();
		System.out.println("Mời bạn nhập vào số bóng đèn");
		this.soBongDen=new Scanner(System.in).nextInt();
	}
	@Override
	public String toString() {
		return "Mã Phòng : "+this.maPhong+"\n"+
				"Dãy nhà : "+this.dayNha+"\n"+
				"Diện tích : "+this.dienTich+"\n"+
				"Số bóng đèn : "+this.soBongDen+"\n";
	}
	
	public boolean chuanSang()
	{
		if((this.dienTich/this.soBongDen)>=10)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}
