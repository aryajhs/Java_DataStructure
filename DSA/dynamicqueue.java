public class dynamicqueue extends circularqueue {
    public dynamicqueue(){
        super();
    }
    public dynamicqueue(int size){
        super(size);
    }

    public boolean insert(int item){
        if(this.isFull()){
            //double the array size
            int[] temp = new int[data.length*2];

            //copy all prev item in new data
            for (int i=0; i< data.length;i++){
                temp[i] = data[(front + i) % data.length];

            }
            front = 0;
            end = data.length;
            data = temp;
        }
        //at this point we know that array is not full
        //insert item
        return super.insert(item);
    }
}
