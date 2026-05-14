import java.util.Scanner;

class arrays{
    public static void main(String[] arg){
       
        //int m[] = new int[3];
        // m[0] = 10;
        // m[1] = 20;
        // m[2] = 30;

        // int m[] = {10,20,30};
        // System.out.println("m[0] = "+ m[0]);
        // System.out.println("m[1] = "+ m[1]);
        // System.out.println("m[2] = "+ m[2]);

        // _________Length and For Loop________________//

        // char m[] = {'a' , 'b', 'c'};
        // int i; 
        // for(i = 0;i<=m.length;i++){
        //     System.out.println("Char " + m[i]);
        // }

        // ______________Sum of Array Elements_______________//
        // int e[] = {10,20,30};
        // int sum = 0;
        // for(int i = 0; i<e.length; i++){
        //     sum = sum + e[i];
        // }
        // System.out.println("Sum of Values :=: " + sum);

        // ____________Array with User Input_______________//
        Scanner sc = new Scanner(System.in);

        int m[] = new int[5];

        for(int i=0;i<5;i++){
            System.out.print("Enter Element no :=:");
            m[i] = sc.nextInt();
        }

        System.out.println("Array Elements:");
        for(int i=0;i<5;i++){
            System.out.println(m[i]);
        }




    }
}