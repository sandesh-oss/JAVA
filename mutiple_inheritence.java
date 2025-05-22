class A{
    void print(){
        System.out.println("i am A");
    }
}
class B{
    void print(){
        System.out.println("i am B");
    }
}
public class mutiple_inheritence extends A,B {
    public static void main(String[] args) {
        mutiple_inheritence obj = new mutiple_inheritence();
        obj.print();
    }
}
