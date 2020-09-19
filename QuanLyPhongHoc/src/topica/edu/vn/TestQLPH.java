package topica.edu.vn;

import java.util.Scanner;

public class TestQLPH {

	public static void main(String[] args) {
		DanhSachPhongHoc listPhongHoc=new DanhSachPhongHoc();
		int chon=0;
		while(chon!=-1)
		{
			System.out.println("1.Thêm Phòng Lý Thuyết");
			System.out.println("2.Thêm Phòng Máy Tính");
			System.out.println("3.Thêm Phòng Thí Nghiệm");
			System.out.println("4.In Toàn Bộ List");
			System.out.println("5.In Toàn Bộ List đạt chuẩn");
			System.out.println("6.Sắp xếp theo dãy nhà");
			System.out.println("7.Sắp xếp theo diện tích");
			System.out.println("8.Sắp xếp theo diện tích");
			System.out.println("9.Xóa");
			System.out.println("10.In Tổng số phòng trong list");
			System.out.println("11.In danh sách phòng máy tính có trên 60 máy");
			System.out.println(".Bạn Chọn Gì ?");
			chon=new Scanner(System.in).nextInt();
			switch (chon) {
			case 1:
				listPhongHoc.themLT();
				break;
			case 2:
				listPhongHoc.themMT();
				break;
			case 3:
				listPhongHoc.themTN();
				break;
			case 4:
				listPhongHoc.xuatToanBo();
				break;
			case 5:
				listPhongHoc.xuatPHdatChuan();
				break;
			case 6:
				listPhongHoc.sapXepTheoDayNha();
				break;
			case 7:
				listPhongHoc.sapXepTheoDienTich();
				break;
			case 8:
				listPhongHoc.sapXepTheoSoBongDen();
				break;
			case 9:
				listPhongHoc.xoaPhongHoc();
				break;
			case 10:
				listPhongHoc.tongSoPhong();
				break;
			case 11:
				listPhongHoc.inDSphongMayCo60May();
				break;

			default:
				break;
			}
		}
	}

}
