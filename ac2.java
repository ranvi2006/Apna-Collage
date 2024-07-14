import java.util.Scanner;

class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter principle");
int p=sc.nextInt();
System.out.println("Enter Rate of interest");
int r=sc.nextInt();
System.out.println("Enter time");
int t=sc.nextInt();

int s_i=(p*r*t)/100;
System.out.println("Simple interest :--  "+s_i);

}


}