import java.util.Scanner;

class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println(" enter your no of rows");
int m=sc.nextInt();
System.out.println(" enter your no of colomn");

int n=sc.nextInt();

for(int i=1;i<=m;i++)
{
  for(int j=1;j<=n;j++)
  {
     if(i==1||j==1||i==m||j==n)
      {
        System.out.print("* ");
           }
else
{

        System.out.print("  ");

}
      }
System.out.println();
}


}
}