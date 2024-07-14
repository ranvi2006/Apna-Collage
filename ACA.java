class  ACA
{
private int a;
protected int b;
public int c;

// non parameterized constructor  
ACA()
{
a=10;b=10;c=10;

}

// parameterized constructor 

ACA( int x)
{
a=x;
b=0;
c=0;
}
ACA( int x ,int y, int z)
{
a=x;
b=y;
c=z;

}

public  int callPrivate()
{
return a;
}

}