import java.util.Scanner;

class if_else_input{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int mark = sc.nextInt();
        if(mark >= 35){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}