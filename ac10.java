import java.util.*;
class  Main
{

 static class Node
{
int data;
Node left;
Node right;

Node(int data)
{
this.data=data;
this.left=null;
this.right=null;


}
}
//----------------------------------

static  class BinaryTree
{
static int idx=-1;
public static Node buildTree(int nodes[])
{
idx++;
if(nodes[idx]==-1)
{
return null;
}
Node newNode=new Node(nodes[idx]);
newNode.left=buildTree(nodes);
newNode.right=buildTree(nodes);
return newNode;


}


}


//----------------------------------
public static void main(String args[])
{
int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
BinaryTree tree=new BinaryTree();

Node root=tree.buildTree(nodes);
preorder(root);
System.out.println();
inorder(root);
System.out.println();
postorder(root);
System.out.println();

levelOrder(root);
System.out.println("sum of nodes :--  "+sumOfNodes(root));
System.out.println("hight of nodes :--  "+hightOfNodes(root));
System.out.println("no of nodes :--  "+countOfNodes(root));
System.out.println("diameter of nodes :--  "+diameter(root));




}
public static void preorder( Node root)
{
if(root==null)
{
return;
}

System.out.print(root.data+"~~");
preorder(root.left);
preorder(root.right);

}

public static void inorder( Node root)
{
if(root==null)
{
return;
}
inorder(root.left);
System.out.print(root.data+"~~");
inorder(root.right);


}
public static void postorder( Node root)
{
if(root==null)
{
return;
}
inorder(root.left);
inorder(root.right);
System.out.print(root.data+"~~");

}
public static void levelOrder(Node root)
{
if(root==null)
{
return;
}
Queue<Node>q=new LinkedList<>();
q.add(root);
q.add(null);


while(!q.isEmpty())
{
Node currNode=q.remove();

if(currNode==null)
{
System.out.println();
if(q.isEmpty())
{
break;
}
else
{
q.add(null);
}

}
else
{
System.out.print(currNode.data+" ");
if(currNode.left!=null)
{
q.add(currNode.left);
}
if(currNode.right!=null)
{
q.add(currNode.right);
}



}


}


}

public static int countOfNodes(Node root)
{
 if(root == null) {
           return 0;
       }

int leftNodes=countOfNodes(root.left);
int rightNodes=countOfNodes(root.right);
return leftNodes+rightNodes+1;
}

public static int sumOfNodes(Node root)
{
 if(root == null) {
           return 0;
       }

int leftSum=sumOfNodes(root.left);
int rightSum=sumOfNodes(root.right);
return leftSum+rightSum+root.data;
}
public static int hightOfNodes(Node root)
{
if(root==null)
{
return 0;
}

int hightLeft=hightOfNodes(root.left);
int hightRight=hightOfNodes(root.right);
int value=hightLeft>hightRight?hightLeft:hightRight;
return value+1;

}

public static int diameter(Node root)
{
if(root==null)
{
return 0;
}

int diam1=diameter(root.left);
int diam2=diameter(root.right);
 int diam3=hightOfNodes(root.right) +hightOfNodes(root.right)+1;
return Math.max(diam1,Math.max(diam2,diam3));

}



}