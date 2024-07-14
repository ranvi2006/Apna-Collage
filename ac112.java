// link multiple linedList;
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
public static void swapping(int m,int n)
{
// get Nodes
Node beforeR1=null;
Node r1=head;
Node beforeR2=null;
Node r2=head;
while(r1.data!=m)
{
beforeR1=r1;
r1=r1.next;
}
while(r2.data!=n)
{
beforeR2=r2;
r2=r2.next;
}
// swapping 
Node n1=new Node(n);
Node n2=new Node(m);
if(beforeR1!=null)
{
n1.next=r1.next;
beforeR1.next=n1;
}
else
{
n1.next=r1.next;
head=n1;
}
n2.next=r2.next;
beforeR2.next=n2;
}

public static void linkLL(Node h1,Node h2,Node h3)
{
head=h1;
Node tempNode=head;
while(tempNode.next!=null)
{
tempNode=tempNode.next;
}
tempNode.next=h2;
while(tempNode.next!=null)
{
tempNode=tempNode.next;
}
tempNode.next=h3;



}
public static void main(String args[])
{
Node head1;
Node head2;
Node head3;
head1=new Node(2);
head1.next=new Node(4);
head1.next.next=new Node(6);
head2=new Node(8);
head2.next=new Node(10);
head2.next.next=new Node(12);
head3=new Node(14);
head3.next=new Node(16);
head3.next.next=new Node(18);
printLL(head1);
printLL(head2);
printLL(head3);
linkLL(head1,head2,head3);
printLL(head);

}
}