package conditionJava;
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b){
            System.out.println("Equal");
        }
        else{
            if(a > b){
                System.out.println("A is grater");
            }
            else{
                System.out.println("A is lesser");
            }
        }
    }
}
