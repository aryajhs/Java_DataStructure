public class aryaqueue {
    int [] data;
    private static final int DEFAULT_VALUE=10;
    int end = 0;

    aryaqueue(){
        this(DEFAULT_VALUE);
    }
    aryaqueue(int size){
        this.data=new int[size];

    }
    public boolean isfull(){
        return end==data.length;
    }
    public boolean isempty(){
        return end==0;
    }

    public boolean insert(int item){
        if(isfull()){
            System.out.println("queue full!");
        }
        data[end++]=item;
        return true;

    }

    public int remove(){
        if(isempty()){
            System.out.println("queue empty");
            
        }
        int removed = data[0];
 
        }
        end--;
        return removed;
    }
    public void display(){
        for(int i=0;i<end;i++){
            System.out.println(data[i]+"");
        }
    }
    public static void main(String[] arg){
        aryaqueue queue = new aryaqueue();
        queue.insert(5);
        queue.insert(4);
        queue.insert(3);
        queue.insert(2);
        queue.insert(1);

        queue.display();
        System.out.println();
        System.out.print(queue.remove());
        System.out.println();
        queue.display();
    }
}
