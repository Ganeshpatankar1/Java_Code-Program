

// public class Shapee {
//    String color;

// }
// class Tringle extends Shapee{

// }

// public class Ganesh{
//     public static void main(String[] args) {
//         Tringle t1 = new Tringle();
//         t1.color = "Black";
//     }
// }


// //SINGLE LEVEL INHERITANCE CLASS / 

// class Shape{
//     public void area(){
//         System.out.println("display area");
//     }
// }

// class Triangle extends Shape{
//     public void area(int l, int h){
//         System.out.println(1/2*l*h);
//     }
// }

// class Equraingle extends Triangle{ //MULTIPLE LEVEL INHRTITANCE CLASS
//     public void area(int l, int h){
//         System.out.println(1/2*l*h);
//     }
// }

// public class SSSOPS{
//     public static void main(String[] args) {
        
//     }
// }

//HIERARCHICAL LEVEL INHERITANCE CLASS / 

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

public class SSSOPS{
    public static void main(String[] args) {
        
    }
}