public class DynamicStack extends customstack{
    public DynamicStack(){
        super();//it will call customstack
    }

    public  DynamicStack(int size){
        super(size);// it wll call customstack(size)
    }

    public boolean push(int item){
        //this takes care of it being full
        if(this.isFull()){
            //double the array size
            int[] temp = new int[data.length*2];

            //copy all prev item in new data
            for (int i=0; i< data.length;i++){
                temp[i] = data[i];

            }
            data = temp;
        }
         
        return super.push(item);
    }
    
}
