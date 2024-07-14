// REMOVE DUBLICATE
class Strings
{
public static void main(String args[])
{

String str="RaajUukumar";
System.out.println(removeDublicate(str));
}

public static String removeDublicate(String str)
{
int arr[]=new int[26];
StringBuilder sb=new StringBuilder("");
for(int i=0;i<str.length();i++)
{
int ch=(int)str.charAt(i);
int index=0;
if(ch<97)
{
 index=ch-65;
}
else
{
 index=ch-97;
}
arr[index]=arr[index]+1;

if(arr[index]==1)
{
sb.append(str.charAt(i));
}
}
return sb.toString();
}

}