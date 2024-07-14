
class LinkedLists
{
static Node head;
static Node tail;
 static int size=0;

 static class Node
{
int data;
Node next;

Node(int data)
{
this.data=data;
this.next=null;

}

}

// addFirst ------------------------------------------------
public static void addFirst(int data)
{


// step 1:- Create a new node
Node newNode=new Node(data);

if(head==null)
{
head=tail=newNode;
size++;
return;

}
//step 2:- asign the value of head to next of now Node

newNode.next=head;// linking process;

// asgin the value of head to new Node
head=newNode;
size++;


}
//---------------------------------------
// addLast
public static void addLast(int data)
{
Node newNode=new Node(data);

if(head==null)
{
head=tail=newNode;
size++;
return;
}

tail.next=newNode;
tail=newNode;
size++;



}
//-----------------------------
//print linkedlist
public static void printLL(Node headx)
{
if(headx==null)
{
System.out.println("list is empty");
return;
}
Node tempNode=headx;
 
while(tempNode!=null)
{

System.out.print(tempNode.data+"-->");
tempNode=tempNode.next;
}
System.out.print("null");
System.out.println();
}
//-----------------------------
// printSize

public static int printSize()
{

return size;
}
//--------------------

public static void rockie(int m,int n)
{
Node currNode=head;

while(currNode.data!=m)
{
currNode=currNode.next;
}
Node afterNode=currNode;
for(int i=0;i<=n;i++)
{
afterNode=afterNode.next;
}
currNode.next=afterNode;

}
public static void main(String args[])
{
addLast(1);
addLast(2);
addLast(3);
addLast(4);
addLast(5);
addLast(6);
addLast(7);
addLast(8);
addLast(9);
printLL(head);
rockie(2,2);
printLL(head);


}
}

