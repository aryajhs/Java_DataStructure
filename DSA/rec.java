 class rec{
     

    public int  fact1(int n){

        int result;
        if(n==0|| n==1)
            return 1 ;


            result=fact1(n-1)*n;
            System.out.println(result);
            return result;
        
    }
     public static void main(String[] arg){
         rec oj = new rec();
         int n=5;
         oj.fact1(n);

     }
 }