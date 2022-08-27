public class customqueue {
    public int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public customqueue(){
        this(DEFAULT_SIZE);
    }


    public customqueue(int size){
        this.data = new int[size];

    }
    public boolean isFull(){
        return end == data.length;
    }
    public boolean isEMPTY(){
        return end == 0; 
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        return true; 
    }
    
    public int remove()throws Exception{
        if(isEMPTY()){
            throw new Exception("Queue is empty!");
    }
    int removed = data[0];
    //shit the elemnts to left

    for(int i=1;i< end ; i++){
        data[i-1] = data[i];
    }
    end--;
    return removed;
}
public int front() throws Exception{
    if (isEMPTY()){
        throw new Exception("Queue is empty");
    }
    return data[0];
}

public void display(){
    for(int i = 0; i< end ;i++)
{
    System.out.print(data[i] + " ");
}
System.out.println("END");
}

public static void main(String[] args) throws Exception{
    customqueue queue = new customqueue(5);
    queue.insert(78);
    queue.insert(9);
    queue.insert(8);
    queue.insert(49);
    queue.insert(69);

    queue.display();
    System.out.println(queue.remove());


    queue.display();
}
}
