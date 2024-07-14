class Recursion
{
public static void main(String args[])
{
int n=4;
int value=printFactorial(n);
System.out.println("factoral of "+n+" is "+value);
}
public static int  printFactorial(int n)
{
if(n==0)
{
return 1;
}
int factorial=n*printFactorial(n-1);

return factorial;

}

}