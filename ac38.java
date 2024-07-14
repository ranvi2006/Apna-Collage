import java.util.Scanner;

class Main
{

public static boolean isPrime(int n)
{
if(n==2)
{
return true;
}
for(int i=2;i<=Math.sqrt(n);i++)
{
if(n%i==0 &&i!=n)
{
return false;
}

}
return true;

}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(isPrime(n))
{
System.out.println(" Yes given num is prime number");
}
else

{
System.out.println(" Yes given num is not a prime number");
}

}
}