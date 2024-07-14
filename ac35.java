import java.util.Scanner;

class Main
{
static class Node
{
int data;
Node left;
Node right;


Node(int data)
{
this.data=data;

}
}
//insert function ---------------------------------------
public static Node insert(Node root , int value )
{
if(root==null)
{
root=new Node(value);


return root;
}

if(root.data>value)
{
root.left=insert(root.left,value);

}
if(root.data<value)
{
root.right=insert(root.right,value);

}

return root;

}

//  inOrder itrate  --------------------------------------------------

public static void inOrder(Node root)
{
if(root==null)
{
return ;

}
inOrder(root.left);
System.out.print(root.data+" ");

inOrder(root.right);


}
// binary serch----------------------------------------------


public static boolean serch(Node root ,int key)
{
if(root==null)
{
return false;
}
if(root.data==key)
{
return true;
}
else if(root.data>key)
{
return serch(root.left,key);

}
else 
{
return serch(root.right,key);
}

}
//--------------------------------------------
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int values[]={5,23,55,54,17,87,2};
Node root=null;
for(int i=0;i<values.length;i++)
{
root =insert(root,values[i]);

}

if(root==null )
{

}
inOrder(root);
System.out.println();
System.out.println("type key for serch");
int key=sc.nextInt();

if(serch(root,key))
{

System.out.println("given key "+key+" is present in tree");
}
else
{
System.out.println("given key "+key+" is  not present in tree");
}





}
}