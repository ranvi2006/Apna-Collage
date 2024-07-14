import java.util.Scanner;

class Main
{

public static void isEven(int num)
{
if(num%2==0)
{
System.out.println("the number "+num+ " is a Even number");
}
else
{
System.out.println("the number "+num+ " is a Odd number");
}

}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
isEven(num);

}
}