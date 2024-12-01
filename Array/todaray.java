package arrayJava;


import java.util.Scanner;
class todaray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int colm = sc.nextInt();

        int[][] numbers = new  int[row][colm];
        // input rows
        for(int i=0; i<row; i++){
            // colom
            for(int j=0; j<colm; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        for(int i=0; i<row; i++){
            for(int j=0; j<colm; j++){
                // compare with x
                if(numbers[i][j] == x){
                    System.out.println("x at found location(" + i +"," + j +")");
                }
            }
        }
    }

}