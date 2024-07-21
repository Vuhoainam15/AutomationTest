package day4;

public class moto_Object {
	
	static String hangxe;
	static String mauxe;
	static String ngaydk;
	
	public static String getInfor()
	{
		return("Hãng xe là: "+hangxe+". Màu xe: "+mauxe+". Ngày đăng ký: "+ngaydk);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		moto_Object xe1 = new moto_Object();
		xe1.hangxe = "SH mode";
		xe1.mauxe = "Đen nhám";
		xe1.ngaydk = "15/10/2024";
		System.out.println(xe1.getInfor());
		
		moto_Object xe2 = new moto_Object();
		xe2.hangxe = "Vision";
		xe2.mauxe = "Trắng";
		xe2.ngaydk = "15/10/2024";
		System.out.println(xe2.getInfor());
	}

}
