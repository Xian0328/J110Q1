class is_prime
{
	public int num;
	public is_prime(int n)
	{
		num=n;
	}
	public void show()
	{
		for(int i=2;i<num;i++)
		{
			if (num%i==0) {
				System.out.println("NO");
				break;
			}
			else {
				System.out.println("YES");
				break;
			}
		}
	}
}
public class class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		is_prime obj=new is_prime(20); //NO
		obj.show();
	}

}
