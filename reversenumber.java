import java.util.*;

public class reversenumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        int res=0,rem;
        while(x!=0){
            rem=x%10;
            res=res*10+rem;
            x=x/10;
        }
        System.out.println(res);
        
    }
}