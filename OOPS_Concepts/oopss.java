

class Student{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //non-parametersize constructor

    // Student(){
    //     System.out.println("Constructor Called");
    // }

    //parametersize constructor
    //copy constructor

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){

    }
}

public class oopss{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ganii";
        s1.age = 22;
        Student s2 = new Student(s1);

        s2.printinfo();
        }

}
