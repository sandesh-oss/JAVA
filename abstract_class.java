//we cannot make object of abstract class, 
//but we can access its properties, we can only make abstract method inside abstract class
//we can use abstract method by overriding
abstract class payment{ 
      abstract void pay(int a);
      void success(){
        System.out.println("payment done");
      }
}
class upiPayment extends payment{
    void pay(int a){           // overriding
        System.out.println("payment via upi" + a);
    }
    
}
class netbanking extends payment{
    void pay(int b){           // overriding
        System.out.println("payment via netbanking" + b);
    }
}

public class abstract_class {   
    public static void main(String[] args){
    payment obj = new upiPayment();
    obj.pay(210004);
    obj.success();
    payment obj1 = new netbanking();
    obj1.pay(51000);
    obj1.success();
}
}
