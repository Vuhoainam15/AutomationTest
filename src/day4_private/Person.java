package day4_private;

public class Person {
	
	private String phone;
	public String name;
	
	//Vì phone là private nên cần tạo method get để lấy infor 
	//và set đêt nhập infor sdt
	

	public String getPhone() {
		return phone;
	}

	public void setPhone(String value) {
		this.phone = value;
	}
	
	

}
