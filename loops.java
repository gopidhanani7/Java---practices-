import java.util.*;

class loops{
    public static void main(String arg[]){
       
       
        // __________For Loop___________________//
        // int n,sum = 0;
        // for(n=1;n<=5;n++){
        //     sum = sum + n;
        // }
        // System.out.println("Sum is : " + sum);


        // __________While Loop_________________//
        // int n = 1;
        // while(n<=5){
        //     System.out.println(n);
        //     n++;
        // }

        // _____________Do-While Loop______________//
        // int i =  1;
        // do{
        //     System.out.println(i);
        //     i++;

        // }while(i<=5);


        // __________For Loop for the Factorial___________________//
        int n,f = 1;
        for(n=1;n<=5;n++){
            f = f * n;
        }
        System.out.println("Factorial  is : " + f);

    }
}