import java.util.Scanner;

class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

while(true)
{
int data=sc.nextInt();
System.out.println("your data is "+data);
if(data%10==0)
{
break;
}

}

}

}