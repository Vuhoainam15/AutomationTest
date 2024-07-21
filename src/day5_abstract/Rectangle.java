package day5_abstract;

public class Rectangle  extends Shape{

	
	//extend: mở rộng, kế thừa
	@Override //chú thích
	//phương thưc dưới override chú giải dưới đây là kế thừa draw từ bên Shape
	public void draw()
	{
		System.out.print("Draw rectangle by 4 edges, use color "+getColor());
		
	}

}
