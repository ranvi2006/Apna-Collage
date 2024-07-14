import java.util.Scanner;

class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int value=1;
int i=1;
while(i<=number)
{
value*=i;
i++;
}
System.out.println(" the factorical of "+number+" is "+value);

}
}