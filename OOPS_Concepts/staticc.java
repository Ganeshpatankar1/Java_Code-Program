class Student{
    String name;
    static  String school;

    // public static void changeSchoole(){
    //     school = "New Kle College"
    // }
}

public class staticc {
   public static void main(String[] args) {
    Student.school = "KLE BELGUIM";
    Student student1 = new Student();
    student1.name = "Shradhha"; 
    System.out.println(student1.school);
   }
     
}
