import java.util.*;

class square{
    
    int square(int n){
        return n * n;
    }    
    public static void main(String args[]){
        square sq = new square();

        int ans = sq.square(5);
        System.out.println("Square is :=: " + ans);
    }
}