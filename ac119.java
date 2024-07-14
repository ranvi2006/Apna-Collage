// Dublicate Paranthess

import java.util.Scanner;
import java.util.Stack;

class Stacks
{
public static boolean dublictaeParenthess( String str)
{

Stack<Character>s=new Stack<>();
if(str.length()==0)
{
 return false;
}
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if(ch!=')'&&ch!=']'&&ch!=')')
{
s.push(ch);
}
else if(ch==')')
{
if(s.peek()=='(')
{
return true;
}
else
{
System.out.println(s);
while(s.peek()!='(')
{
s.pop();
}

s.pop();
System.out.println("-----------" +s);
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
System.out.println(s);
while(s.peek()!='[')
{

s.pop();

}
s.pop();
System.out.println("-----------" +s);
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
System.out.println(s);
while(s.peek()!='{')
{

s.pop();

}
s.pop();
System.out.println("-----------" +s);
}

}

}
System.out.println("==="+s);
// for--
return false;

}
//-------------------
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
System.out.println(dublictaeParenthess(str));
}


}

