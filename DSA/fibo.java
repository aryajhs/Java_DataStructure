public class fibo {

    public int series(int n){
        if(n<=1)
        return n;

        return series(n-1)+series(n-2);
        
        
    }
    public static void main(String[] arg){
        fibo obj = new fibo();
        int maxnumber=9;
    
        for(int i=0; i<=maxnumber;i++){
        System.out.println(obj.series(i)+"");
        }
    }
    
}
