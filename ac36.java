import java.util.Scanner;

class Main
{

public static int product(int a,int b)
{
return a*b;

}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();

int value=product(a,b);
System.out.println("the product of this no is "+value);


}

}