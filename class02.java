class is_prime
{
	public int num;
	public int a;
	public is_prime(int n)
	{
		num=n;
	}
	public void show()
	{
		for(int i=2;i<num;i++)
		{
			a=0;
			int k=num%i;
			if (k==0) {
				a=1;
				break;
			}
		}
		if (a==0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
public class class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		is_prime obj=new is_prime(23); //NO
		obj.show();
		is_prime obj1=new is_prime(37);
		obj1.show();
		is_prime obj2=new is_prime(39);
		obj2.show();
	}

}
