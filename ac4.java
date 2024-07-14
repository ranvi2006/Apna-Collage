import java.util.Scanner;

class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
boolean is_prime=true;

for(int i=2;i<=n;i++)
{
if(n%i==0 &&n!=i)
{
is_prime=false;
}

}

if(is_prime)
{
System.out.println(" It is a prime number");
}
else
{
System.out.println(" It is a not number");
}

}

}