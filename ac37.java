import java.util.Scanner;

class Main
{

public static double factorial(int n,int r)
{
int fact1=1;
int fact2=1;
int fact3=1;
int nth=n>r?n:r;

for(int i=1;i<=nth;i++)
{
if(i<=n)
{
fact1=fact1*i;
}
if(i<=r)
{
fact2=fact2*i;
}
if(i<=(n-r))
{
fact3=fact3*i;
}

}
return fact1/(fact2*fact3);

}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int r=sc.nextInt();
double fact=factorial(n,r);
System.out.println("Binomial cofficent is  "+fact);


}
}