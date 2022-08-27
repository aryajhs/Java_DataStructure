import java.util.*;
class muttu
{
    public static void main (String[]0 args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1;i<=x+1;i++)
        {
            int AP=(3*i)+2;
            if(AP%4==0)
            {
                System.out.println(AP+"");
            }
        }
    }
}

