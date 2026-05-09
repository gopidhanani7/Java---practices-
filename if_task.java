import java.util.Scanner;

class if_task{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Even Or ODD number
        
        //int num = sc.nextInt();
        // if(num % 2 == 0){
        //     System.out.println(num + " Number is Even.");
        // }else{
        //     System.out.println(num + " Number is Odd.");
        // }

        //_______________________________________//
        // Biggest number of given number

        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // if(num1 > num2){
        //     System.out.println(num1 + " Number is Bigger.");
        // }
        // else if(num1 == num2){
        //     System.out.println("Both are equal numbers");
        // }
        // else {
        //     System.out.println(num2 + " Number is Bigger.");
        // }

         //_______________________________________//
        // Number of given number Positive or negative

        int num1 = sc.nextInt();
        if(num1 > 0){
            System.out.println(num1 + " Number is Positive.");
        }
        else {
            System.out.println(num1 + " Number is Negative.");
        }
        
    }
}