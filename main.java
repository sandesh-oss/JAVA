/*public class oop{
    public static void main(String[] args){
        student obj = new student(16);
        obj.print();
    }
}
class student{
    int age;   // instant variable
    student(int age){    //constructor
        this.age = age;
    }
    void print(){
        System.out.println(age);
    }
}  */



class vehicle{
    void run(){
        System.out.println("runnnn");
    }
}
class bike extends vehicle{
    void run(){
        System.out.println("it also runnns");
        super.run();  // it only runs parent method
    }
}
// public class main{
//     public static void main(String[] args){
//         vehicle obj = new bike();            // method overriding
//         obj.run();
       
//     }
// }