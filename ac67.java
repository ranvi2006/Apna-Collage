class Strings
{
public static void main(String args[])
{
 String str="aaabbbaaaaacccddd";
String str1=compressString(str);
System.out.println(str);
System.out.println(str1);
}

public static String compressString(String str)
{
StringBuilder sb=new StringBuilder("");

char ch=str.charAt(0);
int value=0;

for(int i=0;i<str.length();i++)
{
if(ch!=str.charAt(i))
{

sb.append(ch);
if(value>1)
{
sb.append(""+value);
}
ch=str.charAt(i);
value=0;
}
if(ch==str.charAt(i))
{
value++;
}

}
return sb.toString();

}

}