import java.util.Scanner;

class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a<b)
{
if(b<c)
{
System.out.println("the largest no  is "+c);
}
else
{
System.out.println("the largest no is "+b);
}

}
else
{
if(a>c)
{
System.out.println("the largest no  is "+a);
}
else
{
System.out.println("the largest no  is "+c);
}


}

}
}