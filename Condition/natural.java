package conditionJava;

import java.util.Scanner;

public class natural {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
    //    int sum = 0;
    //    for(int i=0; i<=n; i++){
    //     sum=sum+i;
    //    }
    //    System.out.println(sum);
        for(int i = 1; i < 20; i++){
            System.out.println(i*n);
        }
    }
    
}
