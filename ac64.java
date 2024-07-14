class Strings
{
public static void main(String args[])
{
String str="pop";

if(checkPalindrom(str))
{
System.out.println("Given String is a palinnndrom ");
}
else{

System.out.println("Given String is not palinnndrom ");
}



}
public static boolean checkPalindrom(String str)
{
int nth=str.length()/2;
if(nth%2!=0)
{
nth++;
}
for(int i=0;i<nth;i++)
{
if(str.charAt(i)!=str.charAt(str.length()-i-1))
{
return false;
}

}
return true;
}

}