public class ll3 {
 

    Node head;
    Node tail;
    int size;
    public  ll3(){
        this.size=0;
    
    }

    public void  insertfirst(int data){
        Node node = new Node(data);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;

    }

    
    public void insertlast(int data){
        if(tail == null)
        {
            insertfirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail=node;
        size++;
    }

    public void insert(int data, int index){
       
    
        Node nn =head;
        if(index==0)
        {
            insertfirst(data);
            return;
        }
        if(index==size){
            insertlast(data);
            return;
        }

        for(int i=0; i< index-1; i++){
            nn=nn.next; //3

        }
        Node node = new Node(data,nn.next);//3
         
        nn.next=node;
        size++;
        

    }
    /*public Node find(int data){
        Node node = head;
        while(node!= null){
            if(node.data == data){
                return node;
            }
            node = node.next;
        }
        return null;
    }*/
 

    public int deletefirst(){
        int temp = head.data;
        head= head.next;
    
        if(head==null){
            tail = null;
        }
        size--;
        return temp;
    
        
    } 
    public int deletelast(){
        Node temp = head;
        int c=0;
        for(int i=0;i<size-2;i++)
        {
            c++;
            temp=temp.next;
        }
        temp.next=null;
        size--;
        System.out.println(c);
        return temp.data;
        



    }
    public Node get(int index){
        Node temp = head;
        for(int i=0; i<index;i++){
            temp = temp.next;
        }
        return temp;
        }





    public int delete(int  index){
            if(index ==0){
                return deletefirst();
            }
            if(index == size-1){
                return deletelast();
            }
            Node prev = get(index-1);
            int val = prev.next.data;
    
            prev.next = prev.next.next;
    
            return val;
            }
         


    



    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }  
        System.out.println("End"); 
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
        ll3 list = new ll3();
        list.insertfirst(32);
        list.insertfirst(90);
        list.insertfirst(89);
        list.insertfirst(35);
        list.insertfirst(21);
        list.insertlast(99);

        //list.insert(23,6);
        list.display();
        //list.deletefirst();
        //list.deletelast();

        list.delete(3);
        

        list.display();
    }

    
}
