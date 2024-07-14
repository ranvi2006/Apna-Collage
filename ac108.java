//DOUBLY LINKED LIST

class LinkedLists
{
static Node head;
static Node tail;
static class Node
{
  int data;
  Node next;
  Node priv;

 Node(int data)
{
this.data=data;
this.next=null;
this.priv=null;
}

}

public static  void addFirst(int data)
{
Node newNode=new Node(data);
if(head==null)
{
head=tail=newNode;
return;
}
newNode.next=head;
head.priv=newNode;
head=newNode;
}
//------------------------------
public static  void addLast(int data)
{
Node newNode=new Node(data);
if(head==null)
{
head=tail=newNode;
}
tail.next=newNode;
newNode.priv=tail;
tail=newNode;

}
//----------------------------------------------
public static void printLL(Node headx)
{
if(headx==null)
{
System.out.println("list is empty");
return;
}
if(headx.next!=null)
{

Node tempNode=headx;
 System.out.print("null<-->");
while(tempNode!=null)
{

System.out.print(tempNode.data+"<-->");
tempNode=tempNode.next;
}
System.out.print("null");
System.out.println();
}
//-----
if(headx.priv!=null)
{

Node tempNode=headx;
 
while(tempNode!=null)
{

System.out.print(tempNode.data+"<-->");
tempNode=tempNode.priv;
}
System.out.print("null");
System.out.println();

}

}
//----------------------------------
public static void deleteFirst()
{
if(head==null)
{
System.out.println("Empty list");
return;
}
if(head.next==null)
{
head=tail=null;
return;
}
head=head.next;
head.priv=null;

}
//-----------------------------
public static void deleteLast()
{

if(head==null)
{
System.out.println("Empty list");
return;
}
if(head.next==null)
{
head=tail=null;
return;
}
tail=tail.priv;
tail.next=null;

}
//------------------------------
public static void reverse()
{
Node privNode=null;
Node currNode=head;
Node afterNode=head.next;

while(afterNode!=null)
{
Node temNode=afterNode.next;
currNode.next=privNode;
currNode.priv=afterNode;
afterNode.next=currNode;
afterNode.priv=temNode;
privNode=currNode;
currNode=afterNode;
afterNode=temNode;

}

head=currNode;

}
//---------------------------------
public static void main(String args[])
{
addFirst(4);
addFirst(3);
addFirst(2);
addFirst(1);

addLast(5);
printLL(head);
reverse();
printLL(head);
}

}