interface Client {     // in interface all methods are abstract class wheter we write abstract
                       // or not this is the difference in abstract class and interface
    void show();
    void print();
}
class Developer implements Client{
    public void show(){    // it is compulsory to make it public
        System.out.println("show the menu");
    }
    public void print(){
        System.out.println("print the bill");
    }
}
public class interfacee {
    public static void main(String[] args){
        Developer obj = new Developer();
        obj.show();
        obj.print();
    }
}
