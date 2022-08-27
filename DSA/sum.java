import java.util.*;
public class sum {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i<=n;i++){
           
            for(int j=1;j<i+1;j++){
                sum=sum+j;
                System.out.print(j);
                 
                System.out.println("+"+(j+1)+"="+sum);
            }
        }

    }
    
}
