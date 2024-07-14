
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

public static void getInsertionNode(Node f1,Node f2)
{

Node com1=f1;int i=-1;
Node com2=f2;int j=-1;
while(com1!=null)
{
i++;

while(com2!=null)
{

j++;
if(com1==com2)
{
System.out.println(com1.data);
System.out.println("in list1 point of insertion at index "+i);
System.out.println("in list2 point of insertion at index "+j);
return;
}
com2=com2.next;
}
j=-1;
com2=f2;

com1=com1.next;
}
System.out.println("no insertion point ");
}
public static void main(String args[])
{
Node head1;
Node head2;
Node simi=new Node(10);
head1=new Node(1);
head2=new Node(2);
head1.next=new Node(3);
head2.next=new Node(4);
head1.next.next=new Node(5);
head2.next.next=simi;
head1.next.next.next=new Node(4);
head1.next.next.next.next=simi;
head1.next.next.next.next.next=new Node(15);
head1.next.next.next.next.next.next=new Node(20);
head2.next.next.next=new Node(12);
head2.next.next.next.next=new Node(14);
head2.next.next.next.next.next=new Node(18);

printLL(head1);
printLL(head2);
getInsertionNode(head1,head2);


}

}

