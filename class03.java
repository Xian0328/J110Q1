
class Data
{
	private String name;
	private Test score;
	public Data(String str,int eng,int m)
	{
		name=str;
		score=new Test(eng,m);
	}
	class Test//(a)
	{
		public int english;//(b)
		public int math;//(b)
		public Test(int eng,int m)//(b)
		{
			english=eng;
			math=m;
		}
		double avg()
		{
			return (english+math)/2.0;//(c)
		}
		public void show_score()
		{
			System.out.println("english="+english+" "+"math="+math+" "+"avg="+avg());
		}
	}
	public void show()//(d)
	{
		System.out.print("name:"+name+" ");
		score.show_score();
	}
}
public class class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data stu1=new Data("Annie",85,92);
		Data stu2=new Data("Brain",77,56);
		stu1.show();
		stu2.show();
	}

}
