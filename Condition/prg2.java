package conditionJava;

import java.util.Scanner;

public class prg2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1: System.out.println("Hello");
                break;
                case 2: System.out.println("Namaste");
                break;
                case 3: System.out.println("Gandu");
                break;
            default: System.out.println("Invalid");
                throw new AssertionError();
        }
    }
}