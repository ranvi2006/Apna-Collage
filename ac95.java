// BACKTRACKING 
// find permutation

class Subsets
{
public static void main(String args[])
{
String str="abc";
findPermutation(str,"");

}

public static void findPermutation(String str,String ans)
{
//Base class
if(str.length()==0)
{
System.out.println(ans);
return;

}
//Recursion
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
String newStr=str.substring(0,i)+str.substring(i+1);
findPermutation(newStr,ans+ch);

}

}

}