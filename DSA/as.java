public class as {
    public int [] data;
    private final static int DEFAULT_SIZE = 10;
    int ptr =-1;

    as()
    {
        this(DEFAULT_SIZE);
    }
    as(int size)
    {
        this.data=new int[size];
    }
    
    public boolean isfull(){
        
        return ptr == data.length;
    }
    public boolean isempty(){
        
        return ptr == -1;
    }
    public boolean push(int item)
    {
        if(isfull())
        {
            System.out.println("full");
        }
        data[++ptr]=item;
        return true;
    }
    public int pop()
    {
        if(isempty()){
            System.out.println("empty");
        }
        return data[ptr--];
    }
public int peek() {
    if(isempty()){
        System.out.println("stack empty");
    }
    return data[ptr];
}

    public static void main(String [] args)
    {
        as stack = new as();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.peek();

    }
}
