package day5_inherritance;

public class Nguoi {
	//thuộc tính: name,age,birthday >> getter và setter
	//phương thức: dichoi(){//triển khai code}
	
	private String name;
	private String age;
	private String birthday;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public void dichoi()
	{
		System.out.println("Trời đẹp thì đi chơi");
	}



}
