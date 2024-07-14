import java.util.Scanner;

class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int value=0;
while(n!=0)
{
int lastNumber=n%10;
n=n/10;
value=(value*10)+lastNumber;

}
System.out.println(value);
}

}