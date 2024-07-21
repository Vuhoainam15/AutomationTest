package day5_inherritance;

public class GV extends Nguoi{
	
	private String maGV;
	private String soNamKN;
	public String getMaGV() {
		return maGV;
	}
	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}
	public String getSoNamKN() {
		return soNamKN;
	}
	public void setSoNamKN(String soNamKN) {
		this.soNamKN = soNamKN;
	}
	
	public void dichoi()
	{
		System.out.println("đi chơi");
		
	}
	
	public void diday()
	{
		System.out.println("Một tuần dạy 5 buổi");
		
	}
	
	

}
