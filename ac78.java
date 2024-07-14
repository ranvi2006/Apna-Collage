import java.util.Scanner;
class Recursion
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=printSum(n);
System.out.println("sum of the natural 1 to "+n+"nt  is"+sum);
}
public static int printSum(int n)
{

if(n==1)
{
return 1;
}

int value=n+printSum(n-1);
return value;
}

}