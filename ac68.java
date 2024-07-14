class Strings
{
public static void main(String args[])
{
String str="armt";
String str1="ramt";
if(checkAnagrams(str,str1))
{

System.out.println("yes both String are the example of Anagrams");
}
else
{
System.out.println("yes both String are not the example of Anagrams");
}
}

public static boolean checkAnagrams(String str,String str1)
{
int arr[]=new int[26];
int arr1[]=new int[26];
for(int i=0;i<str.length();i++)
{
int index=str.charAt(i);
arr[index-97]=arr[index-97]+1;
}
for(int i=0;i<str1.length();i++)
{
int index=str1.charAt(i);
arr1[index-97]=arr1[index-97]+1;
}

for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]+"  "+arr1[i]);
}



for(int i=0;i<arr.length;i++)
{
if(arr[i]!=arr1[i])
{
 return false;
}
}
return true;
}
}