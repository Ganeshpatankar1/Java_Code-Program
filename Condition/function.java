package conditionJava;

import java.util.Scanner;

public class function {
    // public static int calculateSum(int a,int b){
    //     int sum = a+b;
    //     return sum;
    public static int calculateProduct(int a,int b){
        return a*b;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("product of To No."+calculateProduct(a, b));
    }
}
