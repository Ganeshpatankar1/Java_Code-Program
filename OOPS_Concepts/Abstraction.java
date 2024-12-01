abstract class Animal{
    abstract  void walk();
    Animal(){
        System.out.println("You are Creating Animal");
    }
    public void eat(){
        System.out.println("Animanl eating a meal/foods");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Create The Horsee");
    }
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}

class Chicken extends Animal{
    public void  walk(){
        System.out.println("Walk on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
    }
}
