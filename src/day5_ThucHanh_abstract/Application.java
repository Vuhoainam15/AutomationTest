package day5_ThucHanh_abstract;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HinhChuNhat hcn1 = new HinhChuNhat();
		hcn1.setTenHinh("Hình chữ nhật 8 x 7= ");
		hcn1.chieudai = 8;
		hcn1.chieurong = 7;
		System.out.println(hcn1.getTenHinh()+hcn1.tinhDienTich());
		
		HinhTron ht1 = new HinhTron();
		ht1.setTenHinh("Bán Kính 5 = ");
		ht1.bankinh = 5;
		System.out.println(ht1.getTenHinh()+ht1.tinhDienTich());
	}

}
