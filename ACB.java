class ACB extends ACA
{
private int d;


ACB()
{
d=10;
}
ACB(int i ,int j)
{
super(i);
d=j;


}
ACB(int i ,int j ,int k ,int l)
{
super(i ,j,k);
d=l;


}

public void add()
{

int sum=callPrivate()+b+c+d;
System.out.println("sum of"+ callPrivate() +","+ b+ ","+ c+ "  and  "+d+ " is " + sum);

}



}