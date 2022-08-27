public class aq {
    public int [] data;
    private final static int DEFAULT_SIZE = 10;
    int end =0;

    aq()
    {
        this(DEFAULT_SIZE);
    }
    aq(int size)
    {
        this.data=new int[size];
    }
    public boolean isfull(){
        
        return end == data.length;
    }
    public boolean isempty(){
        
        return end == 0;
    }
    public boolean insert(int item)
    {
        if(isfull())
        {
            System.out.println("tumharimaaka bhosdakitna bharega bhosdi keeeee");
            return false;
        }

        data[end++] = item;
        return true;
    }

    public int delete()
    {
        if(isempty())
        {
            System.out.println("tumharimaaka bhosdakitna barne ki jagah hi ni hai bhosdi keeeee");
        }
        int removed = data[0];
        //shit the elemnts to left
    
        for(int i=1;i< end ; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public void display(){
        for(int i=0;i<end;i++){
            System.out.print(data[i] + "  ");
        }
    }
    public static void main(String[] arg){
        aq queue = new aq();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.display();
        System.out.println();
        System.out.print(queue.delete());
        System.out.println();
        queue.display();


    }


    
}
