public class circularqueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;
    int front = 0;
    int size = 0;

    public circularqueue(){
        this(DEFAULT_SIZE);
    }


    public circularqueue(int size){
        this.data = new int[size];

    }
    public boolean isFull(){
        return size == data.length;
    }
    public boolean isEMPTY(){
        return size == 0; 
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end% data.length;
        size++;
        return true; 
    }
    public int remove()throws Exception{
        if(isEMPTY()){
            throw new Exception("Queue is empty!");
    }
    int removed = data[front++];
    front = front % data.length;
    size--;
    end--;
    return removed;
}
public int front() throws Exception{
    if (isEMPTY()){
        throw new Exception("Queue is empty");
    }
    return data[front];
}
public void display(){
    if(isEMPTY()){
        System.out.println("Empty");
        return;
    }
   int i = front;
   do{
       System.out.print(data[i]+ " -> ");
       i++;
       i %= data.length;

   }while(i != end);
   System.out.println("END");
}

public static void main(String[] arg) throws Exception{
    var queue = new circularqueue();
    queue.insert(3);
    queue.insert(6);
    queue.insert(5);
    queue.insert(19);
    queue.insert(1);

    queue.display();
    System.out.println(queue.remove());
    queue.insert(13);
    queue.display();
    System.out.println(queue.remove());
    queue.insert(130);
    queue.display();
 

}

}
