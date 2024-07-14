// Valid parenthess
import java.util.Stack;
import java.util.Scanner;
class Stacks
{

public static boolean checkValidParenthess(String str)
{
System.out.println(str);
Stack<Character>s=new Stack<>();
if(str.length()==0)
{
return true;
}
if(str.length()==1)
{
return false;
}

for(int i=0;i<str.length();i++)
{

char ch=str.charAt(i);
if(ch=='('||ch=='{'||ch=='[')
{

s.push(ch);

}
else
{
if(checkPairs(s,ch))
{

s.pop();
}
else
{
return false;
}
}
}
return true;
}
public static boolean checkPairs(Stack<Character>s,char ch)
{

if(ch==')')
{
if(s.peek()=='(')
{

return true;
}
else
{
return false;
}
}
else if(ch==']')
{
if(s.peek()=='[')
{


return true;

}
else
{
return false;
}
}
else if(ch=='}')
{
if(s.peek()=='{')
{


return true;

}
else
{
return false;
}

}

return true;

}


public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();

System.out.println(checkValidParenthess(str));


}
}