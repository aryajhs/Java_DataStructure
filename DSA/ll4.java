public class ll4 {
    Node head;
    Node tail;
    int size;
    public ll4(){
        this.size=0;
    }
    public void insertfirst(int data){
        Node node = new Node(data);
       
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
         
         
        size++;

    }
    
    public void insertlast(int data){
        Node node = new Node(data);
        Node temp = head;
        if(tail==null){
           insertfirst(data);
           return;
        }
        for(int i =0;i<size-1;i++){
            temp=temp.next;
        }
        temp.next=node;
        node=temp;
        size++;
    }

    public void insert(int data , int index){
        Node temp = head;
        for(int i=0; i<index-1; i++){
            temp=temp.next;
        }

        Node node = new Node(data,temp.next);
         
        temp.next=node;
        
        size++;

    }
    public void  deletefirst(){
        Node temp = head;
        head=temp.next;
    }
    public int deletelast(){
        Node temp = head;
        for(int i=0;i<size-3;i++){
            temp=temp.next;

        }
        temp.next=null;
        size--;
        return temp.data;
        
    }
    
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println("END");
        size++;
    }
    public class Node{
        int data;
        Node next;
        

        public Node(int data){
            this.data=data;
        }
        public Node (int data, Node next){
            this.data=data;
            this.next=next;
        }
    }

    public static void main(String[] arg){
        ll4 list = new ll4();
        list.insertfirst(32);
        list.insertfirst(45);
        list.insertfirst(99);
        list.insertfirst(69);
        list.insertfirst(23);
        list.insertlast(69);
        

        
        list.insert(90, 3);
        list.display();
        //list.deletefirst();
        list.deletelast();
        list.display();
    }
}
