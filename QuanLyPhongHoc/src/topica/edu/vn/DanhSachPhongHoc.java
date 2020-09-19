package topica.edu.vn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class DanhSachPhongHoc {
	private ArrayList<PhongHoc> listPhongHoc=new ArrayList<PhongHoc>();

	public ArrayList<PhongHoc> getListPhongHoc() {
		return listPhongHoc;
	}

	public DanhSachPhongHoc() {
	
	}
	public void themLT()
	{
		PhongLyThuyet plt=new PhongLyThuyet();
		boolean flag=false;
		while(flag==false)
		{
			plt.nhap();
			if(listPhongHoc.contains(plt.getMaPhong()))
			{
				System.out.println("Mã phòng bị trùng");
				
			}
			else
			{
				listPhongHoc.add(plt);
				flag=true;
			}
		}
	}
	public void themMT()
	{
		PhongMayTinh pmt=new PhongMayTinh();
		boolean flag=false;
		while(flag==false)
		{
			pmt.nhap();
			if(listPhongHoc.contains(pmt.getMaPhong()))
			{
				System.out.println("Mã phòng bị trùng");
				
			}
			else
			{
				listPhongHoc.add(pmt);
				flag=true;
			}
		}
		
		
	}
	public void themTN()
	{
		PhongThiNghiem ptn=new PhongThiNghiem();
		boolean flag=false;
	
		while(flag==false)
		{
			ptn.nhap();
			if(listPhongHoc.contains(ptn.getMaPhong()))
			{
				System.out.println("Mã phòng bị trùng");
				
			}
			else
			{
				listPhongHoc.add(ptn);
				flag=true;
			}
		}
		
		
	}
	public void xuatToanBo()
	{
		Iterator<PhongHoc> it=listPhongHoc.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public void xuatPHdatChuan()
	{
		for(PhongHoc p : listPhongHoc)
		{
			if(p instanceof PhongLyThuyet)
			{
				if(((PhongLyThuyet) p).chuanLyThuyet())
				{
					System.out.println(p);
				}
			}
			if(p instanceof PhongMayTinh)
			{
				if(((PhongMayTinh) p).chuanMT())
				{
					System.out.println(p);
				}
			}
			if(p instanceof PhongThiNghiem)
			{
				if(((PhongThiNghiem) p).chuanTN())
				{
					System.out.println(p);
				}
			}
			
		}
	}
	public void sapXepTheoDayNha()
	{
		Comparator<PhongHoc> sxTheoDay=new Comparator<PhongHoc>() {
			
			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				// TODO Auto-generated method stub
				return o1.getDayNha().compareTo(o2.getDayNha());
			}
		};
		Collections.sort(listPhongHoc,sxTheoDay);
	}
	public void sapXepTheoDienTich()
	{
		Comparator<PhongHoc> sxTheoDT=new Comparator<PhongHoc>() {
			
			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				if(o1.getDienTich() > o2.getDienTich())
					return 1;
				else if(o1.getDienTich() < o2.getDienTich())
					return -1;
				else
				return 0;
			}
		};
		Collections.sort(listPhongHoc,sxTheoDT);
	}
	public void sapXepTheoSoBongDen()
	{
		Comparator<PhongHoc> sxTheoBD=new Comparator<PhongHoc>() {
			
			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				if(o1.getSoBongDen() > o2.getSoBongDen())
					return 1;
				else if(o1.getSoBongDen() < o2.getSoBongDen())
					return -1;
				else
				return 0;
			}
		};
		Collections.sort(listPhongHoc,sxTheoBD);
	}
	public void xoaPhongHoc()
	{
		System.out.println("Mời bạn nhập vào mã phòng cần xóa");
		int ma=new Scanner(System.in).nextInt();
		Iterator<PhongHoc> it=listPhongHoc.iterator();
		while(it.hasNext())
		{
			PhongHoc ph=it.next();
			if(ma==ph.getMaPhong())
			{
				System.out.println("Bạn có chắc là xóa không ?");
				String s=new Scanner(System.in).nextLine();
				if(s.equalsIgnoreCase("Có"))
				{
					it.remove();
				}
				else
				{
					System.out.println("Đã hủy xóa");
				}
			}
		}
	}
	public void tongSoPhong()
	{
		int dem=0;
		
		for(PhongHoc p : listPhongHoc)
		{
			dem++;
		}
		System.out.println("Tổng số phòng trong danh sách là "+dem);
	}
	public void inDSphongMayCo60May()
	{
		for(PhongHoc p : listPhongHoc)
		{
			if(p instanceof PhongMayTinh && ((PhongMayTinh) p).getSoMayTinh()>=60)
			{
				System.out.println(p);
			}
		}
	}
	
}
