
class pen{
    String color;
    String typee;

    public void write(){
        System.out.println("writing something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class oops{
    public static void main(String[] args) {
        // pen pen1 = new pen();
        // pen1.color = "pink";
        // pen1.typee = "gell";

        // pen pen2 = new pen();
        // pen2.color = "black";
        // pen2.typee = "ballpoint";

        // pen1.printcolor();
        // pen2.printcolor();
    

        Student s1 = new Student();
        s1.name = "Ganesh";
        s1.age = 22;

        s1.printinfo();
    }

}
