class Cal_area
{
	public double pi=3.14159;
	public int radius;
	public int width;
	public int height;
	public int length;
	public Cal_area(int r,int w,int h,int l)
	{
		radius=r;
		width=w;
		height=h;
		length=l;
	}
	double Area1()
	{
		return 4.0*pi*radius*radius*radius/3.0;
	}
	int Area2() 
	{
		return (2*width*length)+(2*length*height)+(2*width*height);
	}
	public void show()
	{
		System.out.println("�b�|="+radius);
		System.out.println("�y����n="+Math.round(Area1()*10.0)/10.0);
		System.out.println(" ");
		System.out.println("��="+length+",�e="+width+",��="+height);
		System.out.println("�ߤ�����n="+Area2());
	}
}
public class class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal_area obj=new Cal_area(10,5,6,4);
		obj.show();
	}

}

/*�b�|=10
�y����n=4188.8
 
��=4,�e=5,��=6
�ߤ�����n=148
*/