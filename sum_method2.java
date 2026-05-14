import java.util.*;
import java.util.Scanner.*;

class sum_method2{
    
   
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    int a = sc1.nextInt();
    int b = sc2.nextInt();
    int sum = 0 ;

    void sum(){
        sum = a + b;
        System.out.println("Sum of values :=: " + sum);
    }

    public static void main(String[] args){
        sum_method2 s = new sum_method2();
        s.sum();
    }
}