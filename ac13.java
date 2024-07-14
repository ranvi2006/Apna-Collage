class Main
{
public static void main(String args[])
{

try
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int value=a/b;
System.out.println(value);
}
catch(Exception e)
{
System.out.println(e);

}

}
}