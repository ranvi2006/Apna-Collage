//LINKEDLIST

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



//----------------------------------
// addAtIndex

public static void addAtIndex(int idx,int data)
{
Node newNode=new Node(data);
if(head==null)
{
head=tail=newNode;
size++;
return;
}
if(idx>size)
{
addLast(data);
return;
}

Node currNode=head;
int i=0;
while(i<idx-1)
{
currNode=currNode.next;
i++;
}
newNode.next=currNode.next;
currNode.next=newNode;
size++;


//            OR

//Node privNode=head;
//Node currNode=head.next;
//for(int i=1;i<idx;i++)
//{
//privNode=privNode.next;
//currNode=currNode.next;
//}
//newNode.next=currNode;
//privNode.next=newNode;
//size++;



}
//--------------------------
// Delete First

public static void deleteFirst()
{
if(head==null)
{
return;
}
head=head.next;
size--;
}
//-----------------------
// Delete Last;

public static void deleteLast()
{
if(head==null)
{
return;
}
if(head.next==null)
{
head=null;
size--;
return;
}
Node currNode=head;
while(currNode.next.next!=null)
{

currNode=currNode.next;
}
currNode.next=null;
size--;

}
//-------------------------------
//Serch
public static int search(int value)
{
if(head==null)
{

return -1;
}
Node currNode=head;
int i=-1;
while(currNode!=null)
{
i++;
if(currNode.data==value)
{
return i;
}
currNode=currNode.next;
}
return -1;
}
//-------------------


// Search Rescursively

public static int searchRes(int target)
{
return helper(head,target,0);
}
//-------------
//Helper
public static int helper(Node head,int target,int idx)
{
if(head==null)
{
return -1;
}
if(head.data==target)
{
return idx;
}

return helper(head.next,target,idx+1);
}
//------------------------
//Reverse a LinkedList

public static Node reverseLL(Node headx)
{
if(headx==null||headx.next==null)
{
return headx;
}
tail=headx;
Node privNode=null;
Node currNode=headx;
Node afterNode=headx.next;
while(afterNode!=null)
{
Node tempNode=afterNode.next;
afterNode.next=currNode;
currNode.next=privNode;
privNode=currNode;
currNode=afterNode;
afterNode=tempNode;

}
return currNode;

}
//----------------------------------
// delete from middle 

public static void deleteFromNth(int n)
{

if(n==size)
{
head=head.next;
return;
}
if(n<1||n>size)
{
return;
}

int data=0;
int idx=size-n;
System.out.println(printSize()+"  "+idx);
Node currNode=null;
Node delNode=head;
for(int i=0;i<idx;i++)
{
System.out.println("-----"+i);
currNode=delNode;
delNode=delNode.next;
System.out.println("..............."+i);

}

System.out.println(currNode.data);
currNode.next=delNode.next;
size--;

}
//--------------------
// Check palindrom;

public static boolean isPalindrom()
{
if(head==null)
{
System.out.println("List Empty");
return false;
}
if(head.next==null)
{
return true;
}
int n=size/2;
if(size%2!=0)
{
n++;
}
for(int i=0;i<n;i++)
{
if(!isEqual(i))
{
return false;
}

}
return true;
}

//-------------------
public static boolean isEqual(int idx)
{
Node temhead=head;
Node temTail=head;
int i;
int j;
for( i=0;i<idx;i++)
{
temhead=temhead.next;
}

for( j=0;j<size-i-1;j++)
{
temTail=temTail.next;
}

if(temhead.data==temTail.data)
{

return true;

}
return false;
}
//-----------------------

// Check Loop Cycle

public static boolean isLoop()
{
Node tortoise=head;
Node rabbit=head;

while(rabbit.next!=null||rabbit!=null)
{
if(tortoise==rabbit)
{
System.out.println("loop is Present in the list");
return true;
}
tortoise=tortoise.next;
rabbit=rabbit.next.next;
}
System.out.println("raju");
return false;
}
//---------------------
//BreakLoop

public static void breakLoop()
{
if(!isLoop())
{
return;
}
Node tortoiseNode=head;
Node rabbitNode=head;

// Detect Loop
System.out.println("Dicted Loop");
while(rabbitNode.next!=null||rabbitNode!=null)
{
tortoiseNode=tortoiseNode.next;
rabbitNode=rabbitNode.next.next;
if(tortoiseNode==rabbitNode)
{
System.out.println(tortoiseNode.data+"   "+rabbitNode.data);
break;
}
}
Node privNode=rabbitNode;
tortoiseNode=head.next;
rabbitNode=rabbitNode.next;
while(rabbitNode!=tortoiseNode)
{
tortoiseNode=tortoiseNode.next;
rabbitNode=rabbitNode.next;
privNode=privNode.next;
}

privNode.next=null;

}
//-------------------
// Merge Sort 

public static Node mergeSort(Node headx)
{
if(headx==null ||headx.next==null)
{
return headx;
}
// to get mid

Node mid=findMid(headx);
Node tem=mid.next;
mid.next=null;

Node headxLeft =mergeSort(headx);
Node headxRight =mergeSort(tem);

return merge(headxLeft,headxRight);
}
//----
public static Node findMid(Node headx)
{
Node slow=headx;
Node fast=headx.next;
while(fast!=null &&fast.next!=null)
{
slow=slow.next;
fast=fast.next.next;
}

return slow;
}
public static Node merge(Node headx1,Node headx2)
{
Node mergeLL=new Node(-1);
Node tem=mergeLL;

while(headx1!=null&&headx2!=null)
{
if(headx1.data<=headx2.data)
{
tem.next=headx1;
headx1=headx1.next;
tem=tem.next;
}
else
{
tem.next=headx2;
headx2=headx2.next;
tem=tem.next;

}
}

while(headx1!=null)
{
tem.next=headx1;
headx1=headx1.next;
tem=tem.next;
}
while(headx2!=null)
{
tem.next=headx2;
headx2=headx2.next;
tem=tem.next;
}


return mergeLL.next;
}
// Zig-Zag
public static void zigZag(Node headx)
{
Node mid=findMid(headx);
Node rightHead=reverseLL(mid.next);
Node right=rightHead;
mid.next=null;


Node newNode=new Node(-1);
Node tem=newNode;
while(headx!=null&&right!=null)
{
if(headx!=null)
{
newNode.next=headx;
newNode=newNode.next;
headx=headx.next;
}
if(right!=null)
{
newNode.next=right;
newNode=newNode.next;
right=right.next;
}

}

head=tem.next;

}
public static void main(String args[])
{
addLast(0);
addLast(1);
addLast(2);
addLast(3);
addLast(4);
addLast(5);
zigZag(head);
printLL(head);

System.out.println("Size of the Linked List "+printSize());

}

}