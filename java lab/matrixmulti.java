import java.util.*;
class matrixmulti
{
  public static void main(String args[])
  {
    int prdt[][]=new int [50][50];
    int a[][]=new int [50][50];
    int b[][]=new int [50][50];
    Scanner s=new Scanner(System.in);
    System.out.println("enter rows and columns");
    int r=s.nextInt();
    int c=s.nextInt();
    System.out.println("enter first matrix");
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        a[i][j]=s.nextInt();
      }
    }
     System.out.println("enter second matrix");
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        b[i][j]=s.nextInt();
      }
    }
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        prdt[i][j]=0;
        for(k=0;k<c;k++)
        {
          prdt[i][j]+=a[i][k]*b[k][j];
      }
    }
    System.out.println("product of the matrices");
     for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        System.out.println(prdt[i][j]+"");
      }
       System.out.println();
       
    }
    s.close()
  }
 }
    s.close();
  }
 }
    
