//RECURSION
// GRID WAYS

class Grids
{
public static void main(String args[])
{
int n=2;
int m=2;

System.out.println("the way to reach "+countWay(0,0,n,m));
}
public static int countWay(int i,int j,int n,int m)
{
if(i==n-1&&j==m-1)
{
return 1;
}
if(i==n||j==m)
{
return 0;
}

return countWay(i+1, j, n, m)+countWay(i, j+1, n, m);
}
}