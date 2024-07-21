package day3;
import java.util.*;

public class vonglap_for {
	
	
	public static void incacsochan()
	{
		for (int i=1;i<=10;i++)
		{
			if (i%2==0)
			System.out.println("Gia tri cua i là: "+i);
		}
	}
	
	public static void insochiahetcho5()
	{
		for (int i = 0; i<=100; i++)
		{
			if (i%12==0)
				System.out.println("So chia het cho 5 là: "+i);
		}
	}
	
	public static void NhapMang(int dodaimang)
	{
		Scanner scanner = new Scanner (System.in);
		int []mangsoNguyen=new int [dodaimang];
		for(int i=0;i<dodaimang;i++)
		{
			System.out.println("Nhap gia tri mang o vi tri thu "+i);
			mangsoNguyen[i] = scanner.nextInt();
		}
		//inmang(mangsoNguyen);
		timgiatrilonnhat(mangsoNguyen);
		sapxepmangTangDan(mangsoNguyen);
		inmang(mangsoNguyen);//sap xep xong moi in cung duoc

	}
	
	public static void inmang(int []mangsoNguyen)
		
	{
		//System.out.println("Do dai cua mang:"+mangsoNguyen.length);
		System.out.println("Cac gia tri cua mang la: ");
		for(int i=0;i<mangsoNguyen.length;i++)
		{
			System.out.print(mangsoNguyen[i]+ " ");
		}
	}
	
	public static void timgiatrilonnhat(int[]mangsoNguyen)
	{
		int solonnhat=0;
		for(int i=0;i< mangsoNguyen.length;i++)
		{
			if(solonnhat < mangsoNguyen[i]) 
				solonnhat = mangsoNguyen[i];
		}
		System.out.println("\nGia tri lon nhat mang la: "+solonnhat);
	}
	
	public static void sapxepmangTangDan(int[] mangsoNguyen)
	{
		int tmp = 0;
		for (int i = 0; i < mangsoNguyen.length; i++)
			for(int j = 0; j< mangsoNguyen.length - 1; j++)
		{
				//System.out.println("Lan lap thu "+j+ " de so sanh"+ mangsoNguyen[j]+"va "+mangsoNguyen[j+1]+":");
			if(mangsoNguyen[j] > mangsoNguyen[j+1])
		    {
				tmp = mangsoNguyen[j];
				mangsoNguyen[j] = mangsoNguyen [j + 1];
				mangsoNguyen[j+1]=tmp;
			}
			//inmang(mangsoNguyen); hàm này để in ra các bước so sánh từng số VD: so sanhs số a với số b là...
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//incacsochan();
		//insochiahetcho5();
		NhapMang(5);


	}

}
