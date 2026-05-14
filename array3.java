import java.util.*;

class array3{
    public static void main(String arg[]){
        
        int a[] = {50,8,11,52,52};
        int max =0 ;
        for(int i=0;i<5;i++){
            max = a[i+1];
            if(a[i]> max){
                System.out.println("Number is Big " + a[i]);
            }
        }
    }
}