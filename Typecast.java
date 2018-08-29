import java.util.Scanner;
class Type
{
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	String s2=s.next();
	int a=Integer.parseInt(s1);
	int b=Integer.parseInt(s2);
	public void max()
	{
		if(a>b)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}
	}
	public static void main(String args[])
	{
		Type t=new Type();
		t.max();
	}
}
		