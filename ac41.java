import java.util.Scanner;

class Main
{

public static int getReverse(int num)
{
int d=num;
int value=0;
while(d>0)
{
int last=d%10;
d=d/10;
value=(value*10)+last;

}
return value;

}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int num1=getReverse(num);
System.out.println("num1 is "+num1);

if(num==num1)
{
System.out.println(num1+" is a palindrom");

}
else
{
System.out.println(num1+" is  not a palindrom");
}
}

}