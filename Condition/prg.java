package conditionJava;

import java.util.Scanner;

public class prg {
    public static void main(String[] args) {
        // System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Not Adult");
        }
    }
}
