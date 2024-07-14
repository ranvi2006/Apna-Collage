import java.util.Scanner;
class Recursion
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=printSum(n,0);
System.out.println("sum of the natural 1 to "+n+"nt  is "+sum);
}
public static int printSum(int n,int st)
{

if(st==n)
{
return n;
}

int value=st+printSum(n,st+1);
return value;
}

}