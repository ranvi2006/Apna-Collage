class Recursion
{
public static void main(String args[])
{
int n=4;
int total=tailingProblem(n);
System.out.println(total);
}
public static int tailingProblem(int n)
{
if(n==0||n==1)
{
return 1;
}
int fmn1=tailingProblem(n-1);
int fmn2=tailingProblem(n-2);
return fmn1+fmn2;

}
}