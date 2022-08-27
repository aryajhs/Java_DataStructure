public class ll69 {
    Node head;
    Node tail;
    int size;
    public ll69(){
        this.size=0;
    }
    public void insertfirst(int data){
        Node node = new Node(data);
       
        node.next=head;
        head=node;
       // if(tail==null){
           // head=tail;

       // }
        size++;
    }
    public void insertlast(int data){
      Node temp= head;
        for(int i = 0 ; i<size-1;i++){
            temp=temp.next;

        }
        Node node = new Node(data);
         temp.next=node;
        size++;


    }


    public void insert(int data , int index)
    {
        Node temp = head;
        if (index == 0)
        {
            insertfirst(data);
        }
        if(index == size-1)
        {
            insertlast(data);
        }
        int i=0;
        while (i<index-2)
        {
            temp = temp.next;
            i++;
        }
        Node node = new Node(data,temp.next);
         temp.next=node;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
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
        public Node(int data, Node next){
            this.data=data;
            this.next=next;
        } 
    }
    public static void main(String[] arg){
        ll69 list = new ll69();
        list.insertfirst(34);
        list.insertfirst(23);
        list.insertfirst(32);
        list.insertfirst(45);
        list.insertlast(43);
        list.display();
        list.insert(69,3);
        list.display();
    }
    
}
