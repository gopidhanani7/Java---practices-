import java.util.*;

class method_all{
    // ----------- No parameter , No Retun Values ---------------//

    // void greet(){
    //     System.out.println("Hello Gopi....");
    // }

    // ----------- With Parameter , No Retun Values ---------------//

    // void add(int a, int b){
    //     System.out.println("Add of two values are :=:" + (a+b));
    // }

    void even_odd(int n){
        if(n%2 == 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }

    // ----------- No Parameter , No Retun Values ---------------//

    // int cube(int n){
    //     return n * n * n;
    // }



    public static void main(String[] arg){
        method_all ma = new method_all();

        // ma.greet();
        
        // ma.add(20,30);
        ma.even_odd(30);
        
        // int ans = ma.cube(2);
        // System.out.println("Cube is :=: " + ans);

    }
}