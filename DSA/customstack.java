 

public class customstack {
    public int[] data;
    private static final int DEFAULT_SIZE = 10;
    

    int ptr = -1;
    public customstack(){
        this(DEFAULT_SIZE);
    }


    public customstack(int size){
        this.data = new int[size];

    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;

        }
        ptr++;
        data[ptr] = item;
        return true;
    }
   
    public int pop() throws stackexception{
        if(isEMPTY()){
            throw new stackexception("Cannot pop from an empty stack!");
        }
       // int removed =  data[ptr];
        //ptr--;
        //return removed;
        return data[ptr--];
    }

    public int peek() throws stackexception{
        if(isEMPTY()){
            throw new stackexception("Cannot peek from an empty stack!");
        }
        return data[ptr];
    }
    public boolean isFull(){
        return ptr == data.length-1;
    }
    public boolean isEMPTY(){
        return ptr == - 1; 
    }
    public static void main(String[] args) throws stackexception{
       // customstack stack = new customstack(5);
       DynamicStack stack = new DynamicStack();
        stack.push(34);
        stack.push(45);
        stack.push(78);
        stack.push(64);
        stack.push(23);
        stack.push(38);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }


}
