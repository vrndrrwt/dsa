import java.util.*;

public class fibonacci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int i=1,j,k=0,sum=0;
        for(j=0;k<x;k++){
            System.out.print(j+" ");
            sum=i+j;
            i=j;
            j=sum;
        }

    }
}