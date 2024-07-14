import java.util.Scanner;

class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double total=0;
for(int i=1;i<=25;i++)
{
total+=sc.nextInt();

}
double t=total/25;
System.out.println("the average scores in 25 exam is "+t);

}
}