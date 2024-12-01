import java.util.*;
import bank.bank;

class Shape{
    public void area(){
        System.out.println("display area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class circle extends Shape{ 
    public void area(int l, int h){
        System.out.println((3.14)*l*h);
    }
}

public class exmple{
    public static void main(String[] args) {
    bank.account account1 = new bank.account();
    account1.name = "Custmor1";        
    }
}