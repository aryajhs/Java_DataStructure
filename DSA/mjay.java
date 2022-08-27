public class mjay
{

    Node head;
    Node tail;
    int size;
 public mjay()
 {
     this.size=0;
 }
 public class Node
 {
     int data;
     Node next;
 
 
 public Node(int data)
 {
     this.data = data;
 }

 public Node(int data, Node next)
 {
    this.data = data;
    this.next = next;
 }


}

public void insertfirst(int data)
{
    Node node = new Node(data);
    node.next=head;
    head=node;
    size++;

}
public void display()
{
    Node temp =head;
    while(temp!=null){
        System.out.print(temp.data + "->");
        temp=temp.next;
    }
System.out.println("END");

}


public static void main(String[] args)
{
    mjay list = new mjay();
    list.insertfirst(44);
    list.insertfirst(66);
    list.insertfirst(75);

    list.display();


}
}
