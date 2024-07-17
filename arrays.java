import java.util.*;

public class arrays{
    public static void main(String[] args){

        int intArray[];

        intArray=new int[8];

        display(intArray);



    }

    public static void display(int[] intArray){
        System.out.print("[ ");
        for(int i=0;i<intArray.length;i++){
            System.out.print(" "+intArray[i]);
        }
        System.out.println(" ]");
        System.out.println();
    }
}