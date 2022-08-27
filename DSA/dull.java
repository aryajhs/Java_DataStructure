public class dull {

    Node head;
    Node tail;
    int size;
    public dull(){
        this.size=0;
    }
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
        public Node(int data, Node next){
            this.data=data;
            this.next = next;
        }
    }

    public void inserfirst(int data){
        
        Node node = new Node(data);
        node=head.next;
        head = node;
        
        size++;
    }
    public void display(){
        Node temp=head;
        if(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.println("end");
    }
    public static void main(String[] arg){
        dull list = new dull();
        list.inserfirst(1);
        list.inserfirst(2);
        list.inserfirst(3);
        list.inserfirst(4);
        list.inserfirst(5);

        list.display();
    }
}
