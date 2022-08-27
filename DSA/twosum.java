import java.util.*;
 
public class twosum {
    public static int[]  twoSum(int[] nums, int target) {
        
        int l = nums.length;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<=l;j++){
                if(nums[i] + nums[j] == target){
                    return (i,j);


                }
               
            }
        }
        return new int[]{-1 , -1};
    }
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[10];
        for(int i =0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        twoSum(nums, target);
    }
}
            
      
    

