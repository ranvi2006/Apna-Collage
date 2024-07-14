class Recursion
{
public static void main(String args[])
{
int n=10;
printFibo(0,1,n);

}
public static void printFibo(int curr,int pri,int n)
{

if(n==0)
{
return;
}
System.out.println(curr);

printFibo(pri,curr+pri,n-1);

}
}