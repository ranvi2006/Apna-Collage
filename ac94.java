// BACKTRACKING 
// find all subsets

class Subsets
{
public static void main(String args[])
{
String str="abc";
subSets(str,"",0);

}
public static void subSets(String str,String ans,int idx)
{
//Base case
{
if(idx==str.length())
{
if(ans.length()==0)
{
System.out.println("null");
}
else
{
System.out.println(ans);
}

return;

}

//recursion
//yes
subSets(str,ans+str.charAt(idx),idx+1);

//NO
subSets(str,ans,idx+1);

}

}

}