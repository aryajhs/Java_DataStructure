 public class ll2{
     Node head;
     Node tail;
     int size;

     public ll2(){
         this.size=0;
     }

     public void insertFirst(int val){
         Node node = new Node(val);
         node.next=head;
         head=node;
         if(tail==null){
             tail=head;
             

         }
         size++;
     }

     public void display(){
         Node temp=head;
         while(temp!=null){
             System.out.print(temp.val+"->");
             temp=temp.next;
         }
         System.out.println("END");

     }


     public class Node{
         int val;
         Node next;
         

         public Node(int val){
             this.val=val;
             next=null;
         }
         public Node(int val, Node next){
             this.val=val;
             this.next=next;
         }
     }
     public static void main(String[] arg){
         ll2 list = new ll2();
         list.insertFirst(1);
         list.insertFirst(2);
         list.insertFirst(23);
         list.insertFirst(99);

         list.display();
     }
 }