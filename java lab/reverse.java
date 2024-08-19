import java.util.*;
class reverse
{
  public static void main(String args[])
  {
    String st,reverse="";
    Scanner s1=new Scanner(System.in);
    System.out.println("enter the string");
    st=s1.nextLine();
    st=st.toLowerCase();
    int length=st.length();
    for(int i=length-1;i>=0;i--)
    {
      reverse=reverse+st.charAt(i);
    }
    System.out.println("reversed string="+reverse);
    s1.close();
  }
}
