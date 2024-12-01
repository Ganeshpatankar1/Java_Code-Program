interface Animal{
 void walk();
}

interface abihor{

}

class horse implements Animal, abihor{
     void Walk(){
        System.out.println("Walks on 4 legs");
    }
}

public class opsjava {
    public static void main(String[] args) {
        horse horse1 = new horse();
        horse1.walk();
    }
}
