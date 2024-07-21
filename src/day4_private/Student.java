package day4_private;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person student1 = new Person();
		student1.name = "Hoài Nam";
		student1.setPhone("0999");
		System.out.println("Họ tên: "+student1.name+". SDT: "+student1.getPhone());
		

		Person student2 = new Person();
		student2.name = "Vương";
		System.out.println("Họ tên: "+student2.name+". SDT: "+student2.getPhone());
	}

}
