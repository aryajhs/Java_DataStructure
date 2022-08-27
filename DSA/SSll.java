public class SSll{
    private ListNode Head;
    private static class ListNode {
        private int data;//Generic Type
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    public int length(){
        if(Head==null)
        {
            return 0;
        }
        int count=0;
        ListNode current = Head;
        while(current != null)
        {
            count++;
            current=current.next;
        }
        return count;
    }

    public void display()
    {
        ListNode current=Head;
        while(current != null)
        {
            System.out.print(current.data + "->");
            current=current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args)
    {
        SSll sll = new SSll();
    
        sll.Head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        sll.Head.next = second;
        second.next = third;
        third.next = fourth;
        sll.display();
       System.out.println( sll.length());
    }
}