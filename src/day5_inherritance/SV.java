package day5_inherritance;

public class SV extends Nguoi {

	private String maSV;
	private int soTinChi;
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public int getSoTinChi() {
		return soTinChi;
	}
	public void setSoTinChi(int soTinChi) {
		this.soTinChi = soTinChi;
	}
	
	
	@Override
	public void dichoi()
	{
		System.out.println("Học hết bài và trời đẹp thì đi chơi");
		
	}
	
	public void dihoc()
	{
		System.out.println("Một tuần học 5 buổi");
		
	}
	
}
