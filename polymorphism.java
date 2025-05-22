class parent{
    void sum(int a){          // compile time polymorphism
        System.out.println(a);
    }
    void sum(int a,int b){
        System.out.println(a+b);
    }
}

public class polymorphism {
    public static void main(String[] args){
        parent obj = new parent();
        obj.sum(5,6);
    }
}
