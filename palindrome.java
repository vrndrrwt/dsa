import java.util.*;

public class palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int sum=0,new_num=x,rem;

        while(x!=0){
            rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
        if(sum==new_num){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}