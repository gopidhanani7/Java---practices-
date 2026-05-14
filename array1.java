import java.util.Scanner;

class array1{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int e[] = new int[5];
        int sum = 0;
        double avg;
        
       
        for(int i = 0 ; i<5;i++){
            System.out.print("Enter Number :=:");
            e[i] = sc.nextInt();
            sum = sum + e[i];
        }

        avg = (double)sum/e.length;
        System.out.println("..............Your Elements...............");
        System.out.println("Sum of your elements :=: " + sum);
        System.out.println("Average of your elements :=: " + avg );
        
    }
}