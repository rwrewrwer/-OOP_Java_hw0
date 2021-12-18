abstract class Math
{
	protected int ans;
	public void show()
	{
		System.out.println("ans = "+ans);
	}
	public abstract void add(int a,int b);//計算a+b
	public abstract void sub(int a,int b);//計算a-b
	public abstract void mul(int a,int b);//計算a*b
	public abstract void div(int a,int b);//計算a/b
	
}
class Compute extends Math
{
	public void add(int a,int b)//計算a+b
	{
		ans = a+b;
	}
	public void sub(int a,int b)//計算a-b
	{
		ans = a-b;
	}
	public void mul(int a,int b)//計算a*b
	{
		ans = a*b;
	}
	public void div(int a,int b)//計算a/b
	{
		ans = a/b;
	}
}
public class hw11_2 {
	public static void main(String argv[])
	{
		Compute cmp = new Compute();
		cmp.mul(3,5);//呼叫mul(int a,int b)
		cmp.show();//呼叫show()
	
}}