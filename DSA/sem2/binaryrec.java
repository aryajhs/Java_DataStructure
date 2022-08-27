class binaryrec{


public static int binarySearchRecursive(int search, int[] array, int start, int end){
    if(start>end)
    {
        return -1;
    }
				
    int middle = (start + end)/2;
    
    
     if (search < array[middle]){
        return binarySearchRecursive(search, array, start, middle - 1);
    }
    
    if (search > array[middle]){
        return binarySearchRecursive(search, array, middle + 1, end);
    }
    
    if (search == array[middle]){
        return middle;
    }
    
    return -1;
}

public static void main(String[] arg)
{
    int array[]={1,2,3,4,5};
    int search = 3;
    int l =array.length-1;
    if(binarySearchRecursive(search, array, 0, l)==-1){

        System.out.println("Element not found!");


    }
    else{
        System.out.println("Element at" + " "+ binarySearchRecursive(search, array, 0, l));
    }
}
}