public class stack {
    public int[]  data;
    private static final int DEFAULT_VALUE=10;

    int ptr=-1;

    public stack()
    {
        this(DEFAULT_VALUE);
    }
    public stack(int size)
    {
        this.data = new int[size];
    }

    public boolean isfull()
    {
        return ptr==data.length-1;
    }

    public boolean isempty()
    {
        return ptr==-1;
    }

    public boolean push(int item)
    {
        if(isfull())
        {
            System.out.println("Stack if full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws stackexception
    {
        if(isempty())
        {
            throw new stackexception("String is empty");
            
        }

        return data[ptr--];
    }

    public int peek() throws stackexception
    {
        if(isempty())
        {
            throw new stackexception("Stack is empty");
        }

        return data[ptr];
    }


    public static void main(String[] arg) throws stackexception
    {
        DynamicStack stack = new DynamicStack();
        stack.push(23);
        stack.push(24);
        stack.push(25);
        stack.push(26);
        stack.push(27);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    
}
