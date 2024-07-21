package day5_inherritance;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SV sv1 = new SV();
		sv1.setName("Nam");
		sv1.setMaSV("SV01");
		sv1.setBirthday("1111");
		sv1.setSoTinChi(20);
		System.out.println("Sinh Vien "+sv1.getName()+"Mã SV: "+sv1.getMaSV());
		sv1.dichoi();
		sv1.dihoc();
		
		SV sv2 = new SV();
		sv2.setName("NH");
		sv2.setMaSV("SV02");
		sv2.setBirthday("1111");
		sv2.setSoTinChi(20);
		System.out.println("Sinh Vien "+sv2.getName());
		sv2.dichoi();
		sv2.dihoc();
		
		
		GV gv1 = new GV();
		gv1.setName("Nam");
		gv1.setMaGV("SV01");
		gv1.setBirthday("1111");
		gv1.setSoNamKN("10");
		System.out.println("GV "+gv1.getName());
		gv1.dichoi();
		gv1.diday();
		
	}

}
