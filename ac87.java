// Friends Pairring

class Recursion
{
public static void main(String args[])
{
int n=3;
System.out.println("toatal ways is "+totalWays(n));

}
public static int totalWays(int n)
{
if(n==1||n==2)
{
return n;
}
System.out.println("single");
int sp=totalWays(n-1);
System.out.println("double");
int dp=totalWays(n-2)*(n-1);
return sp+dp;


}

}