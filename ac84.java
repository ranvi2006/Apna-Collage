import java.util.Scanner;
class Recursion
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of x");
int x=sc.nextInt();
System.out.println("Enter the value of n");
int n=sc.nextInt();
int value=findPower(x,n);
System.out.println(value);
}
public static int findPower(int x,int n)
{
if(n==0)
{
return 1;

}

return x*findPower(x,n-1);

}
}