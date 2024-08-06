import java.util.Scanner;
class Frequency
{
 public static void main(String args[])
{
	System.out.println("enter a string:");
	Scanner sc=new Scanner(System.in) ;
	String s=sc.nextLine();
	char ch=sc.next().charAt(0);
	int frequency=0;
	for(int i=0;i<s.length();i++)
	{
	if(ch==s.charAt(i))
	{
	frequency++;
	}
	}
	System.out.println("frequency of "+ch+" is "+frequency);
	
}
}
