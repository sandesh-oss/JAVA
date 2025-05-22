interface Client1 {     
    void show();
}
interface Client2 {     
    void show();
}
public class multiple_inherit_java implements Client1, Client2 {
    public void show(){
        System.out.println("show the menu");
    }
    public static void main(String[] args) {
        multiple_inherit_java obj = new multiple_inherit_java();
        obj.show();
    }
}
