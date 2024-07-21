package day4_Quanlyxeprivate;

public class Xemay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Xe xemay1 = new Xe();
		xemay1.setLoaixe("Honda");
		xemay1.setTenxe("SH mode");
		xemay1.setVantocmax(120);
		System.out.println(xemay1.getLoaixe()+","+xemay1.getTenxe()+","+xemay1.getVantocmax());
		
		Xe xemay2 = new Xe();
		xemay2.setLoaixe("Honda");
		xemay2.setTenxe("Lead");
		xemay2.setVantocmax(120);
		System.out.println(xemay2.getLoaixe()+","+xemay2.getTenxe()+","+xemay2.getVantocmax());
		
	}

}
