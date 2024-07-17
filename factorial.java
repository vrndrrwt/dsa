import java.util.*;

public class factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();   //5*4*3*2*1

        int res=1;

        while(x>0){
            res=res*x;
            x--;
        }
        System.out.println(res);
    }
}