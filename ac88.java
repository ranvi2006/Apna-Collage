import java.util.Scanner;

class Recursion
{
public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

printBinString(n,0,"");

}

public static void printBinString(int n,int lastPlace,String str)
{
if(n==0)
{
System.out.println(str);
return;
}


if(lastPlace==0)
{
printBinString(n-1,0,str+"0");
printBinString(n-1,1,str+"1");
}
if(lastPlace==1)
{
printBinString(n-1,0,str+"0");
}








}

}