import java.util.Scanner;
class Recursion
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
StringBuilder sb=new StringBuilder("");
System.out.println(toString(n,sb,0));
}
public static String toString(int n,StringBuilder sb,int index)
{
String str[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
String st=""+n;
if(index==st.length())
{
return sb.toString();
}
int idx=Integer.parseInt(st.charAt(index)+"");
toString(n,sb.append(str[idx]+" "),index+1);

return sb.toString();
}
}