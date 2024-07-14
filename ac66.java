import java.util.*;
class  Strings
{
public static void main(String args[])
{
String str="i am raju Kumar Mnadal";
 String str1=toUpperCase(str);
System.out.println(str);
System.out.println(str1);

}

public static String toUpperCase(String str)
{
StringBuilder sb=new StringBuilder("");
sb.append(Character.toUpperCase(str.charAt(0)));
for(int i=1;i<str.length();i++)
{
if(str.charAt(i-1)==' ')
{
sb.append(Character.toUpperCase(str.charAt(i)));
}
else
{
sb.append(str.charAt(i));
}

}
return sb.toString();

}

}